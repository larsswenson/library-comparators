# Library Sorting System

This Java app enhances a school library's digital catalog with custom sorting. 
This allows sorting based on criteria such as title, author, and year of publication. 
Additionally, it supports a chained sort order for refined searches.

## Features

- **Default**: Books are sorted alphabetically by title.
- **Author**: Allows sorting of books by author names.
- **Year**: Books can be sorted by year of publication in descending order.
- **Chained Sorting**: Books are first sorted by author, and then by title if authors are the same.

## File Structure

- `Book.java`: Defines Book class with title, author, and year.
- `AuthorComparator.java`: Implements Comparator for sorting books by author.
- `YearComparator.java`: Implements Comparator for sorting books by publication year.
- `ChainedComparator.java`: Implements chained Comparator for sorting by author, then by title.
- `Library.java`: Contains main method to run application and demonstrate sorting features.


