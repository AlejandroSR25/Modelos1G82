from tkinter import *
from tkinter import messagebox, ttk

from PIL import Image, ImageTk
from ImgLoadRel import ImgRelativeLoad


class Interfaz():
    def __init__(self):
        self.raiz = Tk()
        self.raiz.geometry('800x600')
        self.raiz.resizable(0, 0)
        self.raiz.configure(bg='white')
        self.raiz.title('AplicaciónPersonajes')
        self.iniciarWidgets()

    def iniciarWidgets(self):
        # Label titulo
        self.label1 = ttk.Label(self.raiz, text="Seleccion de Personajes", font=("Heebo", 20, 'bold'), background="white").place(
            x=250, y=20, width=310, height=50)
        # Label Salir
        self.button1 = ttk.Button(self.raiz, text="Salir",
                                  command=self.raiz.destroy).place(x=700, y=550, width=50, height=30)
        # Label seleccion raza
        self.label2 = ttk.Label(self.raiz, text="Seleccione la raza", font=("Heebo", 12), background="white").place(
            x=100, y=100, width=200, height=30)
        # Combobox de razas
        self.method = StringVar(value="Seleccionar")
        self.combobox1 = ttk.Combobox(self.raiz, values=["Humano", "Elfo", "Enano", "Orco"], state="readonly", textvariable=self.method).place(
            x=100, y=130, width=200, height=30)  # Agregar aqui la raza del personaje
        # ValorRadio
        self.radioValue = IntVar()
        self.radioValue.set(1)
        # Radiobutton Hombre
        self.radio1 = Radiobutton(self.raiz, text="Hombre",
                                  variable=self.radioValue, value=1, background="white").place(x=400, y=130, width=80, height=30)
        # Radiobutton Mujer
        self.radio1 = Radiobutton(self.raiz, text="Mujer",
                                  variable=self.radioValue, value=2, background="white").place(x=600, y=130, width=80, height=30)
        # Label subtitulo personaje
        self.label3 = ttk.Label(self.raiz, text="Personaje", font=("Heebo", 12), background="white").place(
            x=160, y=450, width=200, height=30)
        # Imagen personaje y Canvas
        self.canv = Canvas(self.raiz, width=80, height=80, bg='white')
        self.canv.place(x=100, y=160, width=200, height=290)

        self.loadedimage = ImgRelativeLoad.loadRelImages(
            "..\Imagenes\default.jpg", 100, 250)
        self.canv.create_image(100, 150, image=self.loadedimage)

        self.raiz.mainloop()


if __name__ == "__main__":

    interfaz = Interfaz()
