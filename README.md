# bindingFormatIssueDemo
Localized BindingFormat Issue Demo Project

* Run the application
* Go to index action of test controller (http://localhost:8080/test/index)
* Click OK button
* You will get validation error (- grails.validation.ValidationErrors: 1 errors Field error in object 'com.mkb.DateCommand' on field 'aDate': rejected value [27/04/2019]; codes [com.mkb.DateCommand.aDate.typeMismatch.error,com.mkb.DateCommand.aDate.typeMismatch,dateCommand.aDate.typeMismatch.error,dateCommand.aDate.typeMismatch,typeMismatch.com.mkb.DateCommand.aDate,typeMismatch.aDate,typeMismatch.java.util.Date,typeMismatch]; arguments [aDate]; default message [Unparseable date: "27/04/2019"])


* @BindingFormat('dd/MM/yyyy') is working fine but
* @BindingFormat(code = 'date.field.format') is giving null.
