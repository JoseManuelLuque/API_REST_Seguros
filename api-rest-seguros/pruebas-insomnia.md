---
icon: inbox-full
layout:
  title:
    visible: true
  description:
    visible: false
  tableOfContents:
    visible: true
  outline:
    visible: true
  pagination:
    visible: false
---

# Pruebas Insomnia

## Obtener Seguros

<mark style="color:green;">`POST`</mark> `/seguros`

**Response**

{% tabs %}
{% tab title="200" %}
{% code overflow="wrap" %}
```json
[
	{
		"idSeguro": 1,
		"nif": "12345678A",
		"nombre": "Juan",
		"ape1": "Pérez",
		"ape2": "García",
		"edad": 35,
		"numHijos": 2,
		"fechaCreacion": "2024-11-01T09:00:00.000+00:00",
		"sexo": "Hombre",
		"casado": true,
		"embarazada": false
	},
	{
		"idSeguro": 2,
		"nif": "87654321B",
		"nombre": "María",
		"ape1": "López",
		"ape2": null,
		"edad": 28,
		"numHijos": 1,
		"fechaCreacion": "2024-10-20T12:30:00.000+00:00",
		"sexo": "Mujer",
		"casado": true,
		"embarazada": true
	}, 
	{ ... 
]
```
{% endcode %}
{% endtab %}
{% endtabs %}

