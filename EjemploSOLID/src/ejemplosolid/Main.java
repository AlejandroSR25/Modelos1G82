class Main {
  public static void main(String[] args) {
    
    Moto[] arrayMotos = {
      new Honda(),
      new Kawasaki(10, 90),
      new Yamaha(20, 80),
      new Starker()
    };
    
    for(Moto moto: arrayMotos){
      moto.conducir();
      System.out.println(moto.mostrarKilometraje());
      System.out.println(moto.getClass());
    }

  }
}