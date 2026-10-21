public class CriaturaMarina {
public void metodo1 () {
System . out . println (" criatura 1") ;
}
public void metodo2 () {
System . out . println (" criatura 2") ;
}
public String toString () {
return " habita en el oceano ";
}
}
class Mamifero extends CriaturaMarina {
public void metodo1 () {
System . out . println (" sangre caliente ") ;
}
}
class Delfin extends Mamifero {
public void metodo1 () {
System . out . println (" sopla burbujas ") ;
}
public String toString () {
return " delfin ";
}
}
class Calamar extends CriaturaMarina {
public void metodo2 () {
System . out . println (" tent´aculos ") ;
}
public String toString () {
return " calamar ";
}
}
