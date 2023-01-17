
The project is structured as follows:

1) There are 2 testing classes
    1.1) Web_test
    1.2) To_DO_Page

2) There are 3 testing suites (three .xml files) :
    2.1) Load&Click.xml (This is for the first task)
    2.2) To-do_Add.xml (This is for the second task)
    2.3) Third_Task.xml (This is for the third task)

  The tests are built in the way to be runnable individually and also part of the suites.
  The first suite Load&Click.xml runs the Web_test class and executes 2 tests. The first is the loading of the page and the second is the
  clicking in the Polymer link. here is asserted if the link is visible to be clicked.

  The second suite To-do_Add.xml runs only the first method in class To_Do_Page. This is to complete the second task given in the assessment
  Here are added two elements in the to-do list. Each of these elements is checked if it is the correct one inserted.

  The third suite Third_Task.xml runs only the second method of class To_Do_Page. This is a suite for the third task given.
  Here the second element in the list is modified. Also this is checked that this change happend in the correct way asserting it.

  All the tests when run were successful.
