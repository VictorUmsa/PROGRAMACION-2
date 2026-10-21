from clases import CriaturaMarina, Mamifero, Delfin, Calamar, Ballena

elementos = [Calamar(), Delfin(), Mamifero(), CriaturaMarina(), Ballena()]

for i in range(len(elementos)):
    print(elementos[i])
    elementos[i].metodo1()
    elementos[i].metodo2()
    
    if isinstance(elementos[i], Ballena):
        elementos[i].nadar()
        
    print()