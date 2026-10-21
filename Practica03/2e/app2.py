from clases import CriaturaMarina, Mamifero, Delfin, Calamar, Ballena

elementos = [
    Calamar("Calamarín"),
    Delfin("Flipper"),
    Mamifero("Oso Marino"),
    CriaturaMarina("Genérica")
]

for i in range(0, len(elementos), 1):
    elementos[i].metodo2()
    print(elementos[i])
    elementos[i].metodo1()
    print()