from escpos.printer import Usb
from unidecode import unidecode
import json

file = open('/home/matheus/arquivos-entregas/printer-scripts/entrega.json')
json_data = json.load(file)

printer = Usb(0x0416, 0x5011)


id_entrega = json_data['id_entrega']
nome_cliente = json_data['nome_cliente']
telefone1 = json_data['telefone1']
telefone2 = json_data['telefone2']
data = json_data['data']
valor = json_data['valor']
observacao = json_data['observacao']

logradouro = json_data['logradouro']
numero = json_data['numero']
bairro = json_data['bairro']
cidade = json_data['cidade']
referencia = json_data['referencia']


nome_cliente = unidecode(nome_cliente)
observacao = unidecode(observacao)
logradouro = unidecode(logradouro)
bairro = unidecode(bairro)
cidade = unidecode(cidade)
referencia = unidecode(referencia)


printer.set(align='center', width=2, height=2)
printer.text('Paes & Cia\n\n')

printer.set(align='center', width=2, height=1)
printer.text('Entrega\n\n')

printer.set(align='left')
printer.text('ID: ' + id_entrega + '\n')
printer.text('Cliente: ' + nome_cliente + '\n')
printer.text('Telefone1: ' + telefone1 + '\n')
if telefone2 != 'null':
	printer.text('Telefone2: ' + telefone2 + '\n')
printer.text('Data: ' + data + '\n')
printer.text('Valor: R$ ' + valor + '\n')
if observacao != 'null':
	printer.text('Observacao: ' + observacao + '\n')

printer.text('\n\n')
printer.set(align='center', width=2, height=1)
printer.text('Endereco\n\n')

printer.text('Logradouro: ' + logradouro + '\n')
printer.text('Numero: ' + str(numero) + '\n')
printer.text('Bairro: ' + bairro + '\n')
printer.text('Cidade:' + cidade + '\n')
if referencia != 'null':
	printer.text('Referencia: ' + referencia + '\n')

printer.text('\n\n')
printer.set(align='center')
printer.text('Agradecemos a preferencia\n')


printer.cut()