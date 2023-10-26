package pack03.game;



class Horse implements Runnable {
    private static int finishLine = 100;
    private static int nextHorseNumber = 1;
    private int horseNumber;
    private int distance = 0;
    private static int rank = 1;

    public Horse() {
        this.horseNumber = nextHorseNumber++;
    }

    @Override
    public void run() {
        while (distance < finishLine) {
            int move = (int) (Math.random() * 10); 
            distance += move;
            System.out.println("말 #" + horseNumber + "은(는) " + distance + " 미터 진행 중입니다.");
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("말 #" + horseNumber + "이(가) 경주를 완료했습니다! 순위: " + rank++);
    }
}