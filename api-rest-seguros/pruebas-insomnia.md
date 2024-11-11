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
	{
		"idSeguro": 3,
		"nif": "45612378C",
		"nombre": "Carlos",
		"ape1": "Martínez",
		"ape2": "Hernández",
		"edad": 40,
		"numHijos": 0,
		"fechaCreacion": "2024-09-15T07:45:00.000+00:00",
		"sexo": "Hombre",
		"casado": false,
		"embarazada": false
	},
	{
		"idSeguro": 4,
		"nif": "78945612D",
		"nombre": "Laura",
		"ape1": "Sánchez",
		"ape2": "Díaz",
		"edad": 30,
		"numHijos": 3,
		"fechaCreacion": "2024-10-05T06:15:00.000+00:00",
		"sexo": "Mujer",
		"casado": true,
		"embarazada": false
	},
	{
		"idSeguro": 5,
		"nif": "12378945E",
		"nombre": "Ana",
		"ape1": "Fernández",
		"ape2": null,
		"edad": 17,
		"numHijos": 0,
		"fechaCreacion": "2024-11-10T11:00:00.000+00:00",
		"sexo": "Mujer",
		"casado": false,
		"embarazada": false
	},
	{
		"idSeguro": 6,
		"nif": "95175342F",
		"nombre": "Pedro",
		"ape1": "Gómez",
		"ape2": "Ruiz",
		"edad": 29,
		"numHijos": 0,
		"fechaCreacion": "2024-08-21T14:20:00.000+00:00",
		"sexo": "Hombre",
		"casado": false,
		"embarazada": false
	},
	{
		"idSeguro": 7,
		"nif": "85214796G",
		"nombre": "Marta",
		"ape1": "Jiménez",
		"ape2": "Ortiz",
		"edad": 22,
		"numHijos": 0,
		"fechaCreacion": "2024-07-15T08:10:00.000+00:00",
		"sexo": "Mujer",
		"casado": false,
		"embarazada": true
	}
```
{% endcode %}
{% endtab %}

{% tab title="400" %}
```json
{
  "error": "Invalid request"
}
```
{% endtab %}
{% endtabs %}

