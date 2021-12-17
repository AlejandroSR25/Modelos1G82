import os, sys
currentdir = os.path.dirname(os.path.realpath(__file__))
parentdir = os.path.dirname(currentdir)
sys.path.append(parentdir)

from Diseno import Interfaz

if __name__ == "__main__":
'''Se inicializa la interfaz'''
    interfaz = Interfaz.Interfaz()
    interfaz.iniciarInterfaz()
