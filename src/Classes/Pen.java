package Classes;

class Pen {
    private Color color; //Класс(перечисление), объект класса
    //private(в пределах класса)
    // protected(в пределах этого и дочерних классов)
    // public(в пределах пакета)
    // (default)(в пределах файла)


    //Конструктор
    Pen(Color color) {
        this.color = color;

    }


    @Override
    public String toString() {
        return "Pen{" +
                "color=" + color +
                '}';
    }
}
