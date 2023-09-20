import java.util.ArrayList;
import java.util.Scanner;

public class MacaPhone implements player.MusicPlayer, browser.InternetBrowser, phone.Phone {

    public static void main(String[] args) {
        System.out.println("Welcome to Maçã Phone!");
        MacaPhone macaPhone = new MacaPhone();

        Scanner  scanner = new Scanner(System.in);
        System.out.print("What do you want to do? \n");
        System.out.print("Play music \n");
        System.out.print("Open website \n");
        System.out.print("Call \n");


        System.out.println("Enter your choice: ");
        String input = scanner.nextLine();
        input = input.toLowerCase();

        if (input.equals("play music")) {
            macaPhone.selectMusic();
            String musicName = scanner.nextLine();
            macaPhone.playMusic(musicName);
        } else if (input.equals("open website")) {
            System.out.println("Enter the url: ");
            String url = scanner.nextLine();
            macaPhone.openWebsite(url);
        } else if (input.equals("call")) {
            System.out.println("Enter the number: ");
            String number = scanner.nextLine();
            macaPhone.call(number);
        } else {
            System.out.println("waiting for a command");
        };
    }

    @Override
    public void openWebsite(String url) {
        System.out.printf("Opening " + url + " in the browser");
    }

    @Override
    public void openNewTab() {
        System.out.println("Opening a new tab");
    }

    @Override
    public void refresh() {
        System.out.printf("Refreshing the page");
    }

    @Override
    public void closeTab() {
        System.out.printf("Closing the tab");
    }

    @Override
    public void call(String phoneNumber) {
        System.out.println("Calling " + phoneNumber + "...");
    }

    @Override
    public void answer() {
        System.out.println("Answering the phone");
    }

    @Override
    public void voiceMail() {
        int voicemails = (int) (Math.random() * 10);
        System.out.println("You have " + voicemails + " voicemails");
        System.out.println("Listening to the voicemail");
    }

    @Override
    public void playMusic(String musicName) {
        System.out.println("Playing " + musicName + " ♪♪♪");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Music paused");
    }

    @Override
    public void selectMusic() {
       ArrayList<String> musicList = new ArrayList<>();
        musicList.add("Song 1");
        musicList.add("Song 2");
        musicList.add("Song 3");

        System.out.println("Selecting music");
        for (String music : musicList) {
            System.out.println(music);
        };
    }
}