class Consumer extends Thread {
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            store.get();
        }
    }
}