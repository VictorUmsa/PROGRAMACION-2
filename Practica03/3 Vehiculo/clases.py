class Sensor:
    tipo = "Genérico"

    def __init__(self, id):
        self.id = id
        self.encendido = False

    def activar(self):
        self.encendido = True

    def desactivar(self):
        self.encendido = False


class Camara(Sensor):
    tipo = "Cámara"

    def __init__(self, id, resolucion):
        super().__init__(id)
        self.resolucion = resolucion


class SensorLuzLaser(Sensor):
    tipo = "Luz Laser"

    def __init__(self, id, alcance):
        super().__init__(id)
        self.alcance = alcance


class VehiculoAutonomo(Camara, SensorLuzLaser):
    tipo = "Vehículo Autónomo"

    def __init__(self, id, resolucion, alcance):
        Camara.__init__(self, id, resolucion)
        SensorLuzLaser.__init__(self, id, alcance)