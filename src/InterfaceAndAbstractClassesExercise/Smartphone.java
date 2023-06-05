package InterfaceAndAbstractClassesExercise;

import java.util.List;

public class Smartphone implements Browsable,Callable{
    List<String> numbers;
    List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }


    @Override
    public String browse() {
        StringBuilder sb= new StringBuilder();
        for (String url : urls) {
            if(hasNumbers(url)){
                sb.append(String.format("Invalid URL!%n"));
            }else{
                sb.append(String.format("Browsing: %s%n",url));
            }
        }

        return sb.toString();
    }

    @Override
    public String call() {
        StringBuilder sb= new StringBuilder();

        for (String number : numbers) {
            sb.append(String.format("Calling... %s%n",number));
        }

    return sb.toString();
    }

    private boolean hasNumbers(String url){
        for (int i = 0; i < url.length(); i++) {
            if(url.charAt(i)>=48 && url.charAt(i)<=57){
                return true;
            }else continue;
        }
        return false;
    }
}