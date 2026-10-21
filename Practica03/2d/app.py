from clases import CriaturaMarina, Mamifero, Delfin, Calamar, Ballena

elementos = [
    Calamar("Calamarín"),
    Delfin("Flipper"),
    Mamifero("Oso Marino"),
    CriaturaMarina("Genérica"),
    Ballena("Willy")
]

for i in range(len(elementos)):
    print(elementos[i])
    elementos[i].metodo1()
    elementos[i].metodo2()
    
    if isinstance(elementos[i], Ballena):
        elementos[i].nadar()
        
    print()