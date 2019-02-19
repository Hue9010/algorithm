package programmers;

public class Hash2 {
    public boolean solution(String[] phone_book) {
        int length = phone_book.length;
        for (int i = 0; i < length - 1; i++) {
            if(isPrefix(phone_book, i, length)){
                return false;
            }
        }
        return true;
    }

    private boolean isPrefix(String[] phoneBook, int index, int length){
        for (int j = index + 1; j < length; j++) {
            if (phoneBook[index].startsWith(phoneBook[j]) | phoneBook[j].startsWith(phoneBook[index])) {
                return true;
            }
        }
        return false;
    }
}
