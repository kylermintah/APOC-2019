# Load libraries
import pandas
from pandas.plotting import scatter_matrix
import matplotlib.pyplot as plt
from sklearn import model_selection
from sklearn.metrics import classification_report
from sklearn.metrics import confusion_matrix
from sklearn.metrics import accuracy_score
from sklearn.linear_model import LogisticRegression
from sklearn.tree import DecisionTreeClassifier
from sklearn.neighbors import KNeighborsClassifier
from sklearn.discriminant_analysis import LinearDiscriminantAnalysis
from sklearn.naive_bayes import GaussianNB
from sklearn.svm import SVC
#from joblib import dump, load

def ML_function(database_file=None, input_file=None):
	#loading the data
	# fieldnames = ['age','sex','cp','chol','target']
	dataset = pandas.read_csv(database_file)
	#print(dataset.groupby('target').size())

	# # box and whisker plots
	# dataset.plot(kind='box', subplots=True, layout=(6,6), sharex=False, sharey=False)
	# plt.show()

	# # histograms
	# dataset.hist()
	# plt.show()

	# # scatter plot matrix
	# scatter_matrix(dataset)
	# plt.show()

	# Split-out validation dataset
	array = dataset.values
	X = array[:,0:1]
	Y = array[:,1]
	validation_size = 0.20
	seed = 7
	X_train, X_validation, Y_train, Y_validation = model_selection.train_test_split(X, Y, test_size=validation_size, random_state=seed)

	# Test options and evaluation metric
	seed = 7
	scoring = 'accuracy'

	# Spot Check Algorithms
	models = []
	models.append(('LR', LogisticRegression(solver='liblinear', multi_class='ovr')))
	models.append(('LDA', LinearDiscriminantAnalysis()))
	models.append(('KNN', KNeighborsClassifier()))
	models.append(('CART', DecisionTreeClassifier()))
	models.append(('NB', GaussianNB()))
	models.append(('SVM', SVC(gamma='auto')))

	# evaluate each model in turn
	results = []
	names = []
	for name, model in models:
		kfold = model_selection.KFold(n_splits=10, random_state=seed)
		cv_results = model_selection.cross_val_score(model, X_train, Y_train, cv=kfold, scoring=scoring)
		results.append(cv_results)
		names.append(name)
		msg = "%s: %f (%f)" % (name, cv_results.mean(), cv_results.std())
		print(msg)



	#dump(model, 'model.pkl')
	# # Compare Algorithms
	# fig = plt.figure()
	# fig.suptitle('Algorithm Comparison')
	# ax = fig.add_subplot(111)
	# plt.boxplot(results)
	# ax.set_xticklabels(names)
	# plt.show()

	# Make predictions on validation dataset
	nb = GaussianNB()
	nb.fit(X_train, Y_train)
	predictions = nb.predict(X_validation)
	# print(X_validation)
	#print(predictions)
	# print(accuracy_score(Y_validation, predictions))
	# print(confusion_matrix(Y_validation, predictions))
	# print(classification_report(Y_validation, predictions))
	# def predictor(user_input):
	#our_pred = nb.predict(user_input)
	#print(our_pred)

if __name__ == '__main__':
    main(
        database_file=sys.argv[1],
        input_file=sys.argv[2],
        ML_function(database_file,input_file)
    )
