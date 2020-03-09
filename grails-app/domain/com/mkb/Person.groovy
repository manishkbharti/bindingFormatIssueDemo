package com.mkb

import grails.databinding.BindingFormat

class Person {

  @BindingFormat(code = 'date.field.format')
  Date aDate
  @BindingFormat('dd/MM/yyyy')
  Date bDate

  static constraints = {
    aDate(nullable: false)
    bDate(nullable: false)
  }
}
