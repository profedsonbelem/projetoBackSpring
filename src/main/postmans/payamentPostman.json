{
	"info": {
		"_postman_id": "aad348d6-af31-483c-a2c3-ec523596deda",
		"name": "Modelo de Aplicações",
		"description": "Esta  collection nos permite que você faça todo o fluxo de autorização de aplicações.",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
	},
	"item": [
		{
			"name": "Sandbox",
			"item": [
				{
					"name": "Solicitando autorização",
					"request": {
						"method": "POST",
						"header": [
							{
								"key": "Content-Type",
								"name": "Content-Type",
								"value": "application/xml",
								"type": "text"
							}
						],
						"body": {
							"mode": "raw",
							"raw": "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\r\n<authorizationRequest>\r\n    <reference>REF1234</reference>\r\n    <permissions>\r\n        <code>CREATE_CHECKOUTS</code>\r\n        <code>RECEIVE_TRANSACTION_NOTIFICATIONS</code>\r\n        <code>SEARCH_TRANSACTIONS</code>\r\n        <code>MANAGE_PAYMENT_PRE_APPROVALS</code>\r\n        <code>DIRECT_PAYMENT</code>\r\n    </permissions>\r\n    <redirectURL>http://seusite.com.br/redirect</redirectURL>\r\n    <notificationURL>http://seusite.com.br/notification</notificationURL>\r\n</authorizationRequest>"
						},
						"url": {
							"raw": "https://ws.sandbox.pagseguro.uol.com.br/v2/authorizations/request/?appId=INFORME_SEU_APPID&INFORME_SEU_APP_KEY=",
							"protocol": "https",
							"host": [
								"ws",
								"sandbox",
								"pagseguro",
								"uol",
								"com",
								"br"
							],
							"path": [
								"v2",
								"authorizations",
								"request",
								""
							],
							"query": [
								{
									"key": "appId",
									"value": "INFORME_SEU_APPID"
								},
								{
									"key": "INFORME_SEU_APP_KEY",
									"value": ""
								}
							]
						}
					},
					"response": []
				},
				{
					"name": "Direcionando para autorização",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "https://sandbox.pagseguro.uol.com.br/v2/authorization/request.jhtml?code=CODIGO_DE_AUTORIZAÇÃO",
							"protocol": "https",
							"host": [
								"sandbox",
								"pagseguro",
								"uol",
								"com",
								"br"
							],
							"path": [
								"v2",
								"authorization",
								"request.jhtml"
							],
							"query": [
								{
									"key": "code",
									"value": "CODIGO_DE_AUTORIZAÇÃO"
								}
							]
						}
					},
					"response": []
				},
				{
					"name": "Consultando uma autorização pelo código de notificação",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "https://ws.sandbox.pagseguro.uol.com.br/v2/authorizations/notifications/CODE_NOTIFICATION?appId=INFORME_SEU_APPID&appKey=INFORME_SEU_APPKEY",
							"protocol": "https",
							"host": [
								"ws",
								"sandbox",
								"pagseguro",
								"uol",
								"com",
								"br"
							],
							"path": [
								"v2",
								"authorizations",
								"notifications",
								"CODE_NOTIFICATION"
							],
							"query": [
								{
									"key": "appId",
									"value": "INFORME_SEU_APPID"
								},
								{
									"key": "appKey",
									"value": "INFORME_SEU_APPKEY"
								}
							]
						}
					},
					"response": []
				}
			]
		},
		{
			"name": "Produção",
			"item": [
				{
					"name": "Solicitando autorização",
					"request": {
						"method": "POST",
						"header": [
							{
								"key": "Content-Type",
								"name": "Content-Type",
								"value": "application/xml",
								"type": "text"
							}
						],
						"body": {
							"mode": "raw",
							"raw": "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\r\n<authorizationRequest>\r\n    <reference>REF1234567</reference>\r\n    <permissions>\r\n        <code>CREATE_CHECKOUTS</code>\r\n        <code>RECEIVE_TRANSACTION_NOTIFICATIONS</code>\r\n        <code>SEARCH_TRANSACTIONS</code>\r\n        <code>MANAGE_PAYMENT_PRE_APPROVALS</code>\r\n        <code>DIRECT_PAYMENT</code>\r\n    </permissions>\r\n    <redirectURL>https://www.pagseguro.uol.com.br</redirectURL>\r\n    <notificationURL>SUA_URL_NOTIFICACAO</notificationURL>\r\n</authorizationRequest>"
						},
						"url": {
							"raw": "https://ws.pagseguro.uol.com.br/v2/authorizations/request/?appId=INFORME_SEU_APPID&INFORME_SEU_APP_KEY=",
							"protocol": "https",
							"host": [
								"ws",
								"pagseguro",
								"uol",
								"com",
								"br"
							],
							"path": [
								"v2",
								"authorizations",
								"request",
								""
							],
							"query": [
								{
									"key": "appId",
									"value": "INFORME_SEU_APPID"
								},
								{
									"key": "INFORME_SEU_APP_KEY",
									"value": ""
								}
							]
						}
					},
					"response": []
				},
				{
					"name": "Direcionando para autorização",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "https://pagseguro.uol.com.br/v2/authorization/request.jhtml?code=CODIGO_DE_AUTORIZAÇÃO",
							"protocol": "https",
							"host": [
								"pagseguro",
								"uol",
								"com",
								"br"
							],
							"path": [
								"v2",
								"authorization",
								"request.jhtml"
							],
							"query": [
								{
									"key": "code",
									"value": "CODIGO_DE_AUTORIZAÇÃO"
								}
							]
						}
					},
					"response": []
				},
				{
					"name": "Consultando uma autorização pelo código de notificação",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "https://ws.pagseguro.uol.com.br/v2/authorizations/notifications/NOTIFICATION_CODE?appId=INFORME_SEU_APPID&INFORME_SEU_APP_KEY=",
							"protocol": "https",
							"host": [
								"ws",
								"pagseguro",
								"uol",
								"com",
								"br"
							],
							"path": [
								"v2",
								"authorizations",
								"notifications",
								"NOTIFICATION_CODE"
							],
							"query": [
								{
									"key": "appId",
									"value": "INFORME_SEU_APPID"
								},
								{
									"key": "INFORME_SEU_APP_KEY",
									"value": ""
								}
							]
						}
					},
					"response": []
				}
			]
		},
		{
			"name": "Enviando XML para cadastro",
			"request": {
				"method": "POST",
				"header": [
					{
						"key": "Content-Type",
						"name": "Content-Type",
						"value": "application/xml",
						"type": "text"
					}
				],
				"body": {
					"mode": "raw",
					"raw": "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\r\n<authorizationRequest>\r\n<reference>123</reference>\r\n<permissions>\r\n<code>CREATE_CHECKOUTS</code>\r\n<code>SEARCH_TRANSACTIONS</code>\r\n<code>RECEIVE_TRANSACTION_NOTIFICATIONS</code>\r\n</permissions>\r\n<redirectURL>http://seusite.com.br/redirect</redirectURL>\r\n<notificationURL>http://seusite.com.br/notification</notificationURL>\r\n<account>\r\n<email>usuario@seusite.com.br</email>\r\n<type>SELLER</type>\r\n<person>\r\n<name>Antonio Carlos</name>\r\n<documents>\r\n<document>\r\n<type>CPF</type>\r\n<value>CPF_SELLER</value>\r\n</document>\r\n</documents>\r\n<birthDate>1982-02-05</birthDate>\r\n<phones>\r\n<phone>\r\n<type>HOME</type>\r\n<areaCode>11</areaCode>\r\n<number>30302323</number>\r\n</phone>\r\n<phone>\r\n<type>MOBILE</type>\r\n<areaCode>11</areaCode>\r\n<number>976302323</number>\r\n</phone>\r\n</phones>\r\n<address>\r\n<postalCode>01452002</postalCode>\r\n<street>Av. Brig. Faria Lima</street>\r\n<number>1384</number>\r\n<complement>5o andar</complement>\r\n<district>Jardim Paulistano</district>\r\n<city>Sao Paulo</city>\r\n<state>SP</state>\r\n<country>BRA</country>\r\n</address>\r\n</person>\r\n</account>\r\n</authorizationRequest>"
				},
				"url": {
					"raw": "https://ws.pagseguro.uol.com.br/v2/authorizations/request/?appId=INFORME_SEU_APPID&INFORME_SEU_APP_KEY=",
					"protocol": "https",
					"host": [
						"ws",
						"pagseguro",
						"uol",
						"com",
						"br"
					],
					"path": [
						"v2",
						"authorizations",
						"request",
						""
					],
					"query": [
						{
							"key": "appId",
							"value": "INFORME_SEU_APPID"
						},
						{
							"key": "INFORME_SEU_APP_KEY",
							"value": ""
						}
					]
				}
			},
			"response": []
		}
	]
}