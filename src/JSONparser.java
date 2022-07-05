public class JSONparser {


    APIhandler api = new APIhandler();

    public int[] getBidAsk(String Stock){
        String JSON = api.getQuote(Stock);
        //TODO: make json parser

    }

}
