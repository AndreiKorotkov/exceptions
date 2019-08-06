class Bus {
      protected   int RublePerKM;
      protected   int Capacity;
      protected   int Price;
      protected   String Mark;
      protected   String Engine;

      public Bus(int RublePerKM, int Capacity, int Price, String Mark, String Engine) {
        this.RublePerKM = RublePerKM;
        this.Capacity = Capacity;
        this.Price = Price;
        this.Mark = Mark;
        this.Engine=Engine;}





    public void setCapacity(int Capacity) throws CapacityException{
        if (Capacity<0)
            throw new CapacityException("Отрицательное число мест");

    }

    public void setPrice(int Price) throws NegativePrice{
        if (Price<0)
            throw new NegativePrice("Отрицательная цена");
    }
    public void setMark(String Mark) throws NullMarkException {
        if (Mark==null)
            throw new NegativePrice("Введите марку");
    }

}

