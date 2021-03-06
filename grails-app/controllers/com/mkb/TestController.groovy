package com.mkb

import grails.databinding.BindingFormat

class TestController {

  def index() {
    render view: 'index'
  }

  def test(DateCommand command) { //Same behavior with domain class - Person
    println command.aDate
    println command.bDate
    println "=${g.message(code: 'date.field.format')}="
    render "${params} <br/><br/> - ${command.errors?.collect { error -> error as String }?.join(', ')}"
  }

  def testDateFormat() {
    java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime())
    render "${g.formatDate(date: date, format: 'yyyy/MM/dd')}"
  }
}

class DateCommand {

  @BindingFormat(code = 'date.field.format')
  Date aDate
  @BindingFormat('dd/MM/yyyy')
  Date bDate

  static constraints = {
    aDate(nullable: false)
    bDate(nullable: false)
  }
}
