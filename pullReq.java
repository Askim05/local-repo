class pullReq{


    public static void merging(String n){
        System.out.println("Conf");
        System.out.println(n);

    }
    public static void branchChange(){
        System.out.println("Merging from branch");
    }
    public static void main(String args[]){
        merging("3");
        System.out.println("Conflict");
    }


}