from Personajes import *

class PjCreator:
    def __init__(self, raza, genero):
        if raza == "Elfo":
            self.pj= Elfo()
            self.pj.vida = 100
            self.pj.setGenero = genero

            if genero == "H":
                self.pj.setAvatarPath('..\Imagenes\Elfo_H.png')
            else:
                self.pj.setAvatarPath('..\Imagenes\Elfo_M.png')

            self.pj.setEscudoPath('../Imagenes/Escudo_elfos.jpg') 
            self.pj.setArmaPath('../Imagenes/Arco.png')
            self.pj.setMonturaPath('../Imagenes/Caballo.jpg')
            
    def retrieve_pj(self):
        if self.pj != None:
            return self.pj
        return None

    def retrieve_clone_pj(self):
        if self.pj != None:
            return self.pj.clone()
        return None