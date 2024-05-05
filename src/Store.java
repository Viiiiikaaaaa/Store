class Store {
    private int stock = 0;

    public synchronized void get() {
        while (stock == 0) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        stock--;
        System.out.println("Потребитель взял 1 товар. Количество товаров на складе: " + stock);
        notify();
    }

    public synchronized void put() {
        while (stock == 10) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        stock++;
        System.out.println("Производитель добавил 1 товар. Количество товаров на складе: " + stock);
        notify();
    }
}