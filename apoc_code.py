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

#loading the data
# fieldnames = ['age','sex','cp','chol','target']
dataset = pandas.read_csv('heart_ML_data.csv')
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
X = array[:,0:4]
Y = array[:,4]
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
print(accuracy_score(Y_validation, predictions))
print(confusion_matrix(Y_validation, predictions))
print(classification_report(Y_validation, predictions))

our_pred = nb.predict([[20, 1, 3, 120]])
print(our_pred)

# #collect input from end-user
# from twilio.rest import Client
# import requests
# import subprocess

# # account_sid = "ACf91ef15300d1f9a4cb7a8e17b52e098f"
# # auth_token = "4efab20650b07c200861c49e2d0f25c1"
# # client = Client(account_sid, auth_token)
# cmd = 'curl -X POST "https://studio.twilio.com/v1/Flows/FW1c810d23229708cd5003a3475b5edb12/Executions" -d "To=+12674411544" -d "From=+18566197407" -u ACf91ef15300d1f9a4cb7a8e17b52e098f:4efab20650b07c200861c49e2d0f25c1'
# subprocess.run(cmd)

