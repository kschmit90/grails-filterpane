package org.grails.plugins.filterpane.test

class Bookmark {

    Book book
    int page
    Date dateCreated

    static constraints = {
        book()
        page()
        dateCreated()
    }

    static mapping = {
        sort "page"
    }
}
