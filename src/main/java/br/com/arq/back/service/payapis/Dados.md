  -d '
  paymentMode=default
  paymentMethod=creditCard
  receiverEmail=fsodilao%40gmail.com
  currency=BRL
  extraAmount=0.00
  itemId1=0001
  itemDescription1=Notebook%20Prata
  itemAmount1=10300.00
  itemQuantity1=1
  itemId2=0002
  itemDescription2=Notebook%20Azul
  itemAmount2=10000.00
  itemQuantity2=1


  notificationURL=https%3A%2F%2Fsualoja.com.br%2Fnotificacao.html&
  reference=REF1234
  senderName=Jose%20Comprador
  senderCPF=22111944785
  senderAreaCode=11
  senderPhone=56273440
  senderEmail=comprador40sandbox.pagseguro.com.br
  senderHash={{hash_do_comprador}}
  


  creditCardToken={{token_do_cartao}}
  installmentQuantity=7&installmentValue=3030.94
  noInterestInstallmentQuantity=5
  creditCardHolderName=Jose%20Comprador
  creditCardHolderCPF=22111944785
  creditCardHolderBirthDate=27%2F10%2F1987
  creditCardHolderAreaCode=11
  creditCardHolderPhone=56273440







  billingAddressStreet=Av.%20Brig.%20Faria%20Lima&
  billingAddressNumber=1384
  billingAddressComplement=5o%20andar
  billingAddressDistrict=Jardim%20Paulistano
  billingAddressPostalCode=01452002
  billingAddressCity=Sao%20Paulo
  billingAddressState=SP 
  billingAddressCountry=BRA


    shippingAddressStreet=Av.%20Brig.%20Faria%20Lima
  shippingAddressNumber=1384
  shippingAddressComplement=5o%20andar&shippingAddressDistrict=Jardim%20Paulistano
  shippingAddressPostalCode=01452002
  shippingAddressCity=Sao%20Paulo
  shippingAddressState=SP
  shippingAddressCountry=BRA
  shippingType=1&
  shippingCost=01.00

  ==========
"d '
paymentMode=default&
paymentMethod=creditCard
receiverEmail=fsodilao%40gmail.com
currency=BRL
extraAmount=0.00
itemId1=0001
itemDescription1=Notebook%20Prata
itemAmount1=10300.00
itemQuantity1=1
itemId2=0002
itemDescription2=Notebook%20Azul
itemAmount2=10000.00
itemQuantity2=1
notificationURL=https%3A%2F%2Fsualoja.com.br%2Fnotificacao.html&reference=REF1234
senderName=Jose%20Comprador
senderCPF=22111944785 
senderAreaCode=11
senderPhone=56273440senderEmail=comprador%40sandbox.pagseguro.com.br&senderHash={{hash_do_comprador}}&shippingAddressStreet=Av.%20Brig.%20Faria%20Lima&shippingAddressNumber=1384&shippingAddressComplement=5o%20andar&shippingAddressDistrict=Jardim%20Paulistano&shippingAddressPostalCode=01452002&shippingAddressCity=Sao%20Paulo&shippingAddressState=SP&shippingAddressCountry=BRA&shippingType=1&shippingCost=01.00&creditCardToken={{token_do_cartao}}&installmentQuantity=7&installmentValue=3030.94&noInterestInstallmentQuantity=5&creditCardHolderName=Jose%20Comprador&creditCardHolderCPF=22111944785&creditCardHolderBirthDate=27%2F10%2F1987&creditCardHolderAreaCode=11&creditCardHolderPhone=56273440&billingAddressStreet=Av.%20Brig.%20Faria%20Lima&billingAddressNumber=1384&billingAddressComplement=5o%20andar&billingAddressDistrict=Jardim%20Paulistano&billingAddressPostalCode=01452002&billingAddressCity=Sao%20Paulo&billingAddressState=SP&billingAddressCountry=BRA'"


  <?xml version="1.0" encoding="ISO-8859-1" standalone="yes"?>

<transaction>
    <date>2019-01-29T14:37:00.000-02:00</date>
    <code>D58A27DC-E03A-47E5-A20A-63AE1B80C5B6</code>
    <reference>REF1234</reference>
    <type>1</type>
    <status>1</status>
    <lastEventDate>2019-01-29T14:37:00.000-02:00</lastEventDate>
    <paymentMethod>
        <type>1</type>
        <code>101</code>
    </paymentMethod>


    <grossAmount>20301.00</grossAmount>
    <discountAmount>0.00</discountAmount>
    <feeAmount>1774.70</feeAmount>
    <netAmount>18526.30</netAmount>
    <extraAmount>0.00</extraAmount>

    <installmentCount>7</installmentCount>
    <itemCount>2</itemCount>
    <items>
        <item>
            <id>0001</id>
            <description>Notebook Prata</description>
            <quantity>1</quantity>
            <amount>10300.00</amount>
        </item>
        <item>
            <id>0002</id>
            <description>Notebook Azul</description>
            <quantity>1</quantity>
            <amount>10000.00</amount>
        </item>
    </items>
    <sender>
        <name>Jose Comprador</name>
        <email>comprador@sandbox.pagseguro.com.br</email>
        <phone>
            <areaCode>11</areaCode>
            <number>56273440</number>
        </phone>
        <documents>
            <document>
                <type>CPF</type>
                <value>22111944785</value>
            </document>
        </documents>
    </sender>


    <shipping>
        <address>
            <street>Av. Brig. Faria Lima</street>
            <number>1384</number>
            <complement>5o andar</complement>
            <district>Jardim Paulistano</district>
            <city>Sao Paulo</city>
            <state>SP</state>
            <country>BRA</country>
            <postalCode>01452002</postalCode>
        </address>
        <type>1</type>
        <cost>1.00</cost>
    </shipping>


    <gatewaySystem>
        <type>cielo</type>
        <rawCode xsi:nil="true" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"/>
        <rawMessage xsi:nil="true" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"/>
        <normalizedCode xsi:nil="true" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"/>
        <normalizedMessage xsi:nil="true" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"/>
        <authorizationCode>0</authorizationCode>
        <nsu>0</nsu>
        <tid>0</tid>
        <establishmentCode>1056784170</establishmentCode>
        <acquirerName>CIELO</acquirerName>
    </gatewaySystem>
</transaction>