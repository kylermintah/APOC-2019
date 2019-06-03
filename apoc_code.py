# Load libraries
import csv
import sys
import pandas
import numpy
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

def main():
	database_file="C:/githubProjects/APOC-2019/heart_ML_data.csv"
	input_file="C:/githubProjects/APOC-2019/APOCFinalGUI/entry.txt"
	#loading the data
	dataset = pandas.read_csv(database_file)
	f = open(input_file, "r")
	user_content = f.read()
	user_content_array = user_content.split(",")
	user_content_array[0] = int(user_content_array[0])
	user_content_array[1] = int(user_content_array[1])
	user_content_array[2] = int(user_content_array[2])
	user_content_array[3] = int(user_content_array[3])
	user_content_array[4] = int(user_content_array[4])
	user_content_array[5] = int(user_content_array[5])

	# Split-out validation dataset
	array = dataset.values
	X = array[:,0:6]
	Y = array[:,6]
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
	return_percentage = 0

	max = -1

	maxIndex = -1
	index = 0


	for name, model in models:
		kfold = model_selection.KFold(n_splits=10, random_state=seed)
		cv_results = model_selection.cross_val_score(model, X_train, Y_train, cv=kfold, scoring=scoring)
		results.append(cv_results)
		names.append(name)

		msg = "%s: %f (%f)" % (name, cv_results.mean(), cv_results.std())

	# get the percentage accuracy
		# if name == 'NB':
		#
		print(msg)

		if cv_results.mean() > max:
			max = cv_results.mean()
			maxIndex = index

		index = index + 1

	# Make predictions on validation dataset and on user input

	runningModel = models[maxIndex][1]
	print(runningModel)
	runningModel.fit(X_train, Y_train)
	predictions_test = runningModel.predict(X_validation)
	prediction_input = [user_content_array]
	prediction_return = runningModel.predict(prediction_input)
	prediction_writer = open('C:/githubProjects/APOC-2019/APOCFinalGUI/prediction.txt', 'w')
	prediction_writer.write(str(prediction_return[0])+','+str(max))
	sys.exit(0)

if __name__ == '__main__':
    main(
        # database_file=sys.argv[1],
        # input_file=sys.argv[2],
    )
