package ru.mirea.task7.num5;

public class ProcessString implements ProcessableString{
    String base;
    public String inverted() {
        char[] charArray = base.toCharArray();
        for(int i=0; i < charArray.length/2; i++){
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = temp;
        }
        return new String(charArray);
    }

    public int count() {
        int c = 0;
        for(int i = 0; i < base.length(); i++) {
           if (base.charAt(i) == ' ')  {
               c++;
           }
        }
        return c;
    }

    public String odd() {
        char[] input = base.toCharArray();
        char[] charArray = new char[base.length()/2];
        for(int i = 0; i < base.length(); i+=2) {
            charArray[i/2] = input[i];
        }
        return new String(charArray);
    }

    public ProcessString(String base) {
        this.base = base;
    }

    @Override
    public String toString(){
        return base;
    }
}
