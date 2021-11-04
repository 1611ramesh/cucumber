Feature: verifying adactin details
Scenario Outline: Verifying adactin login with valid credential
Given User is in the adactin url  
When User should enter "ramesh1995","<password>"
And User should click login button 
Then enter datas "<location>" ,"<hotels>","<room>"
And  select datas "<norooms>","<datein>","<dateout>","<adultroom>"
When final page enter "<firstname>","<lastname>","<address>","<cc>","<cctype>","<ccexp>","<ccyear>","<ccv>"
Then User should verify login msg
Examples: 
|password|location|hotels|room|norooms|datein|dateout|adultroom|firstname|lastname|address|cc|cctype|ccexp|ccyear|ccv|
|W0K010  |3       |4     |Double|2 - Two|11/11/2021|13/11/2021|1 - One|ramesh|kumar|kalpakkam|1212139876543213|VISA|March|2018|124|

