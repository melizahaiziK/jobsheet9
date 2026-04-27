public class StackSurat11 {
    Surat11[] stack;
    int top;
    int size;

    public StackSurat11(int size){
        this.size = size;
        stack = new Surat11[size];
        top = -1;
    }
    public boolean isFull(){
        if (top == size -1){
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }
    public void push(Surat11 s){
        if (!isFull()) {
            top++;
            stack[top] = s;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh!");
        }
    }
    public Surat11 pop(){
        if(!isEmpty()) {
            Surat11 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }
    public Surat11 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("stack kosong!");
            return null;
        }
    }
    public void cari(String nama) {
        boolean ketemu = false;
        for (int i = 0; i <= top; i++){
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)){
                System.out.println("Surat ditemukan: ");
                stack[i].tampil();
                ketemu = true;
            }
        }
        if (!ketemu){
            System.out.println("Surat tidak ditemukan.");
        }
    }
}
