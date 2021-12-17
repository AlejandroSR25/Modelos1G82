from tkinter import *
import tkinter as tk
from tkinter import messagebox, ttk

from PIL import Image, ImageTk
import os, sys
currentdir = os.path.dirname(os.path.realpath(__file__))
parentdir = os.path.dirname(currentdir)
sys.path.append(parentdir)
from Logica.ImgLoadRel import ImgRelativeLoad


class Interfaz():
    def __init__(self):
        self.raiz = Tk()
        self.raiz.geometry('800x600')
        self.raiz.resizable(0, 0)
        self.raiz.configure(bg='white')
        self.raiz.title('AplicaciónPersonajes')
        self.iniciarWidgets()

    def iniciarWidgets(self):
        # Creacion Notebook
        self.nb = ttk.Notebook(self.raiz)
        self.nb.pack(fill='both', expand='yes')

        # Pestaña creacion personajes
        self.pestaña_creacion = tk.Frame(self.nb, bg="beige")
        self.nb.add(self.pestaña_creacion, text='Crear Personaje')

        # Label titulo
        self.label_titulo = ttk.Label(self.pestaña_creacion, text="Seleccion de Personajes", font=("Heebo", 20, 'bold'), background="beige").place(
            x=250, y=10, width=310, height=50)

        # Boton Crear
        self.button1 = ttk.Button(self.pestaña_creacion, text="Crear").place(x=700, y=530, width=50, height=30)

        # Label seleccion raza
        self.label_raza = ttk.Label(self.pestaña_creacion, text="Seleccione la raza", font=("Heebo", 12), background="beige").place(
            x=100, y=70, width=200, height=30)

        # Combobox de razas
        self.sv_raza = StringVar(value="Seleccionar")
        self.combobox1 = ttk.Combobox(self.pestaña_creacion, values=["Humano", "Elfo", "Enano", "Orco", "Hobbit"], state="readonly", textvariable=self.sv_raza)
        self.combobox1.place(x=100, y=100, width=200, height=30)
        self.combobox1.bind("<<ComboboxSelected>>", lambda _: self.actualizarImagenes())

        # ValorRadio
        self.radioValue = StringVar()
        self.radioValue.set("H")

        # Radiobutton Hombre
        self.radio1 = Radiobutton(self.pestaña_creacion, text="H",
                                  variable=self.radioValue, value='H', background="beige").place(x=350, y=100, width=80, height=30)

        # Radiobutton Mujer
        self.radio1 = Radiobutton(self.pestaña_creacion, text="M",
                                  variable=self.radioValue, value="M", background="beige").place(x=450, y=100, width=80, height=30)

        # Label y Spinbox Seleccion numero de personajes a crear
        self.label_numero = tk.Label(
            self.pestaña_creacion, text='Numero a crear:', bg="beige").place(x=550, y=100, width=100, height=30)
        self.valorspin = tk.IntVar()
        self.spinbox_numero = tk.Spinbox(self.pestaña_creacion, from_=1, to=20, bg="beige", state='readonly', wrap='true', textvariable= self.valorspin).place(
            x=650, y=100, width=50, height=30)

        # Label subtitulo personaje
        self.label_personaje = ttk.Label(self.pestaña_creacion, text="Personaje", font=("Heebo", 12), background="beige").place(
            x=160, y=500, width=75, height=30)

        # Imagen defautl personaje
        self.selectorImagen("..\Imagenes\pj_default.jpg",
                            "Personaje", 150, 300)

        # Label subtitulo escudo
        self.label_escudo = ttk.Label(self.pestaña_creacion, text="Escudo", font=("Heebo", 12), background="beige", anchor=CENTER).place(
            x=360, y=300, width=75, height=30)

        # Imagen default Escudo
        self.selectorImagen(
            "..\Imagenes\Escudo_default.png", "Escudo", 100, 100)

        # Label subtitulo Armadura
        self.label_armadura = ttk.Label(self.pestaña_creacion, text="Armadura", font=("Heebo", 12), background="beige", anchor=CENTER).place(
            x=560, y=300, width=75, height=30)

        # Imagen default Armadura
        self.selectorImagen(
            "..\Imagenes\Armadura_default.png", "Armadura", 100, 100)

        # Label subtitulo Arma
        self.label_arma = ttk.Label(self.pestaña_creacion, text="Arma", font=("Heebo", 12), background="beige", anchor=CENTER).place(
            x=360, y=500, width=75, height=30)

        # Imagen default Arma
        self.selectorImagen(
            "..\Imagenes\Arma_default.png", "Arma", 150, 150)

        # Label subtitulo Montura
        self.label_montura = ttk.Label(self.pestaña_creacion, text="Montura", font=("Heebo", 12), background="beige", anchor=CENTER).place(
            x=560, y=500, width=75, height=30)

        # Imagen default montura
        self.selectorImagen(
            "..\Imagenes\montura_default.jpg", "Montura", 150, 150)

    def selectorImagen(self, ruta, tipo, resizex, resizey):
        if tipo == 'Personaje':

            self.canv_personaje = Canvas(self.pestaña_creacion, bg='white')
            self.canv_personaje.place(x=100, y=150, width=200, height=340)

            self.loadedimage_pj = ImgRelativeLoad.loadRelImages(
                ruta, resizex, resizey)
            self.canv_personaje.create_image(
                100, 175, image=self.loadedimage_pj)

        if tipo == 'Montura':
            self.canv_montura = Canvas(self.pestaña_creacion, bg='white')
            self.canv_montura.place(x=520, y=340, width=150, height=150)

            self.loadedimage_mt = ImgRelativeLoad.loadRelImages(
                ruta, resizex, resizey)
            self.canv_montura.create_image(75, 75, image=self.loadedimage_mt)

        if tipo == 'Escudo':
            self.canv_escudo = Canvas(self.pestaña_creacion, bg='white')
            self.canv_escudo.place(x=320, y=150, width=150, height=150)

            self.loadedimage_escudo = ImgRelativeLoad.loadRelImages(
                ruta, resizex, resizey)
            self.canv_escudo.create_image(
                75, 75, image=self.loadedimage_escudo)

        if tipo == 'Arma':
            self.canv_arma = Canvas(self.pestaña_creacion, bg='white')
            self.canv_arma.place(x=320, y=340, width=150, height=150)

            self.loadedimage_arma = ImgRelativeLoad.loadRelImages(
                ruta, resizex, resizey)
            self.canv_arma.create_image(75, 75, image=self.loadedimage_arma)

        if tipo == 'Armadura':
            self.canv_armadura = Canvas(self.pestaña_creacion, bg='white')
            self.canv_armadura.place(x=520, y=150, width=150, height=150)

            self.loadedimage_armadura = ImgRelativeLoad.loadRelImages(
                ruta, resizex, resizey)
            self.canv_armadura.create_image(
                80, 75, image=self.loadedimage_armadura)

    def actualizarImagenes(self):
        pass
        

    
    def iniciarInterfaz(self):
        self.raiz.mainloop()
