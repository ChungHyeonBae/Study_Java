package pack03.game;

class DownloadTask implements Runnable {
    private String filename;
    
    public DownloadTask(String filename) {
        this.filename = filename;
    }
    
    @Override
    public void run() {
        System.out.println(filename + " 다운로드중...");
        
        
        
        System.out.println(filename + " 다운로드 완료");
    }
}