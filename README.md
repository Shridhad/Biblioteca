Biblioteca
==========

Requirements for Biblioteca
Business Case

The Bangalore Public Library System – Biblioteca is a legacy application with no tests. Given our experience with refactoring legacy code we have agreed with the stakeholder to start the code again using a TDD approach. This will allow us to easily add more functionality in the future.

Therefore the decision has been made to rewrite the application using TDD. The following requirements must be implemented.
Business Requirements

We couldn’t find the old requirement list however the business told us that these still apply:

    The customer should see a welcome when they start the application.
    A customer should have a list of menu options at the start of the application.
    A customer should be able to select a menu option.
    A customer should be notified if they do not select a valid option with “Select a valid option!!”
    A customer should be able to view all books the library has.
    A customer should be able to reserve a book for collection.
    A customer should be notified if their selected book was reserved successfully with “Thank You! Enjoy the book.”
    A customer should be notified if their selected book is not available with “Sorry we don't have that book yet.”
    A customer should be able to check their library number and be notified with “Please talk to Librarian. Thank you.”

Technical Requirements

    This needs to stay a console application. For UI specifications with respect to design, colour etc use your own imagination
    We do not need a database at this point.
