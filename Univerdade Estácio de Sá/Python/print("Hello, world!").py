print("Hello, world!")

a = 0
for i in range(30):
    if a % 2 == 0:
        a += 1
        continue
    else:
        if a % 5 == 0:
            break
        else:
            a += 3
print (a)



def soma (b, c):
    return b + c

resultado = soma (3, 5)

print("A soma é: ", resultado)

# Entrada de dados
nota1 = 8
nota2 = 9
# Calculando a média
media = (nota1 + nota2) / 2
# Imprimindo o resultado
print("A média das notas é:", media)


contador = 0
while contador < 5:
    print("Contador é: ", contador)
    contador += 1

# Solicita ao usuário que insira as três notas
nota1 = float(input("Digite a primeira nota: "))
nota2 = float(input("Digite a segunda nota: "))
nota3 = float(input("Digite a terceira nota: "))
 
# Calcula a média das notas
media = (nota1 + nota2 + nota3) / 3
 
# Mostra o resultado ao usuário
print(f"A média das notas é: {media:.2f}")

hamburguer = 10.50
batata_frita = 4.00
refrigerante = 3.00

quantidade_hamburguer = int(input("Digite a quantidade de hambúrgueres desejados: "))
quantidade_batata = int(input("Digite a quantidade de batatas fritas desejadas: "))
quantidade_refrigerante = int(input("Digite a quantidade de refrigerantes desejados: "))

preco_total = (hamburguer * quantidade_hamburguer) + (batata_frita * quantidade_batata) + (refrigerante * quantidade_refrigerante)

print("O preço total do seu pedido é: R$", preco_total)

idade = eval(input('Informe a idade da criança: \n'))
if idade < 5:
    print('A criança deve ser vacinada contra a gripe.')
    print('Procure o posto de saúde mais próximo.')
elif idade == 5:
    print('A vacina estará disponível em breve.')
    print('Aguarde as próximas informações.')
else:
    print('A vacinação só ocorrerá daqui a 3 meses.')
    print('Informe-se novamente neste prazo.')
print('Cuide da saúde sempre. Até a próxima.')

idade = int(input("Digite sua idade: "))
if idade < 10:
    print("Você é uma criança.")
elif idade >= 10 and idade <= 15:
    print("Você é um adolescente.")
elif idade >= 16 and idade < 18:
    print("Você é menor de idade.")
elif idade >= 18 and idade < 65:
    print("Você é adulto.")
else
    print("Você é um idoso.")

    texto = "programação"
letra_para_contar = "a"
contador = 0

for letra in texto:
    if letra == letra_para_contar:
        contador += 1

print(f"A letra '{letra_para_contar}' aparece {contador} vezes na palavra '{texto}'.")

numeros = [1, 2, 3, 4, 5]
for numero in numeros:
    quadrado = numero ** 2
    print(f'O quadrado de {numero} é {quadrado}')

    while true:
    print('Você está no primeiro laço.')
    opcao1 = input('Deseja sair dele? Digite SIM para isso. \n')
    if opcao1 == 'SIM':
        break  # este break é do primeiro laço
    else:
        while true:
            print('Você está no segundo laço.')
            opcao2 = input('Deseja sair dele? Digite SIM para isso. \n')
            if opcao2 == 'SIM':
                break  # este break é do segundo laço
        print('Você saiu do segundo laço.')
print('Você saiu do primeiro laço')

for num in range (1000,10000):
    menor = num % 100 #obtem o numero dos algarismos menos significativos
    maior = num // 100 #obtem o numero dos algarismos mais significativos
    raiz = menor + maior  #obtem a raiz

    if (raiz * raiz ) == num: #valida se a raiz gera o numero testado
        print(num)
        print(menor)
        print(maior)
        print(raiz)
print('terminou')
print('saiu ', num)

def validar_cpf(cpf):
    # Removendo caracteres não numéricos
    cpf = ''.join(filter(str.isdigit, cpf))

    # Verificando se o CPF possui 11 dígitos
    if len(cpf) != 11:
        return False

    # Verificando se todos os dígitos são iguais (caso raro, mas inválido)
    if cpf == cpf[0] * 11:
        return False

    # Calculando o primeiro dígito verificador
    soma = sum(int(cpf[i]) * (10 - i) for i in range(9))
    resto = soma % 11
    if resto < 2:
        digito_verificador_1 = 0
    else:
        digito_verificador_1 = 11 - resto

    # Verificando o primeiro dígito verificador
    if int(cpf[9]) != digito_verificador_1:
        return False

    # Calculando o segundo dígito verificador
    soma = sum(int(cpf[i]) * (11 - i) for i in range(10))
    resto = soma % 11
    if resto < 2:
        digito_verificador_2 = 0
    else:
        digito_verificador_2 = 11 - resto

    # Verificando o segundo dígito verificador
    if int(cpf[10]) != digito_verificador_2:
        return False

    # CPF válido
    return True
 
# Testando a função
cpf = "123.456.789-09"
if validar_cpf(cpf):
    print(f"O CPF {cpf} é válido.")
else:
    print(f"O CPF {cpf} é inválido.")