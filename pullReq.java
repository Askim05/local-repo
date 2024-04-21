class pullReq{


    public static merging(string n){
        System.out.println("Conf");
        System.out.println(n);

    }
    public static branchChange(){
        System.out.println("Merging from branch");
    }
    public static void main(String args[]){
        merging("3");
        System.out.println("Conflict");
    }


}