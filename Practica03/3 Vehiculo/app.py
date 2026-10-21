from clases import VehiculoAutonomo

vehiculo = VehiculoAutonomo("S001", "4K", 100)

print(f"ID: {vehiculo.id}")
print(f"Tipo: {vehiculo.tipo}")
print(f"Resolución: {vehiculo.resolucion}")
print(f"Alcance: {vehiculo.alcance} metros")
print(f"Estado encendido: {vehiculo.encendido}")

vehiculo.activar()
print(f"Estado encendido después de activar: {vehiculo.encendido}")