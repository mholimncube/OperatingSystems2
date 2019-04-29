# CSC3002 OS Assignment Part II by Mholi Mncube MNCMHO001
27/04/2019

# Aim
This assignment aims to give you experience in thread (and, by extension, process)
synchronization using semaphores. In this project, you will write multithreaded
programs in Java to solve three classic synchronization problems, using only
semaphores. A secondary aim is to give you experience in reading, understanding
and correcting existing code. The assignment is in three parts, increasing in
difficulty. The second part is described below.
1 Part I: Simple barrier with semaphores

Part II: Dish washing with semaphores
In this simulation, you will correctly implement a simple simulation of dish-washing
in a kitchen. There are two roles: washer and dryer, with a shared rack between them
for the wet dishes. The washer washes dishes one-by-one, adding them to the rack for
drying. The dryer removes the wet dishes from the rack one-by-one to dry them.
There are several synchronization constraints to enforce to make this system work
correctly:

* Only one person should access the shared rack at any point.
* When the rack is empty, the dryer must wait.
* When the rack is full, the washer must wait.
* The dryer cannot dry a dish before the washer has washed it

# Instructions for running and compling

* Run Terminal/CMD to directory of project
* Make file > to compile the java files
* Type - "java CleaningDishes 6 3 100 100" to run test 
* Alternatively type run/run1 to run test which have input values 6 3 100 100, 4 2 100 100
* Delete .class files make > clean


