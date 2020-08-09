package gt.com.antiguaburger.antiguaburgerweb.print;


import gt.com.antiguaburger.antiguaburgerweb.modelo.OrderEntity;

/**
 * 
 */
public class PrintHTML implements IPrinter {

    /**
     * Default constructor
     */
    public PrintHTML() {
    }



    @Override
    public void print(OrderEntity order) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        int i=1;
        int sum=0;
        try
        {
            fichero = new FileWriter("/tmp/order.html");
            pw = new PrintWriter(fichero);
            pw.println("<html>\n" +
                    "<head>\n" +
                    "<title>Antigua Burger </title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<h1 align=\"center\" >Antigua Burger order </h1>\n" +
                    "<hr>\n <table style=\"width:20%\">");
            pw.println("<tr><td>=================== </td> <td>============================ </td></tr>");
            pw.println(" <tr> \n <td> <strong> order </strong> </td> <td> "+header.getOrder()+" </td> \n </tr>");
            pw.println(" <tr> \n <td> <strong> cashier </strong> </td> <td> "+header.getCashier()+" </td> \n </tr>");
            pw.println(" <tr> \n <td> <strong> username </strong> </td> <td> "+header.getUsername()+" </td> \n </tr>");
            pw.println(" <tr> \n <td> <strong> date </strong> </td> <td> "+header.getDate()+" </td> \n </tr>");
            pw.println(" <tr> \n <td> <strong> customer </strong> </td> <td> "+header.getCustomer()+" </td> \n </tr>");
            pw.println(" <tr> \n <td> <strong> taxId </strong> </td> <td> "+header.getTaxid()+" </td> \n </tr>");
            pw.println("<tr><td>=================== </td> <td>============================ </td></tr>");
            pw.println(" <tr> \n <td> <strong> menu </strong> </td> <td> "+order.getType()+" </td> \n </tr>");
            // pw.println("<tr>\n   <td> <strong> item </strong> </strong> </td> \n <td>  <strong> option  </strong> </td> \n </tr>");
            for(String value : order.getFood().getItem()){
                pw.println("<tr> <td>---</td> \n <td> "+value);
                pw.println(" "+order.getFood().getOption().get(i-1)+"<td> </tr>");
                i++;
            }
            i=1;
            for(String value : ex.getExtras()){
                pw.println("<tr> <td> <strong> extra "+i+" </strong></td> <td>"+value+"</td>");
                i++;
            }
            for (int a = 0; a < ex.getPriceE().size(); a++) {
                sum += ex.getPriceE().get(a);
            }
            pw.println("<tr><td>==================== </td> <td>============================ </td></tr>");
            pw.println("<tr> <td> <strong> Total </strong> </td> <td>"+(order.getTotal()+sum)+"</td> </tr>");
            pw.println("<tr><td>==================== </td> <td>============================ </td></tr>");
            pw.println("</body> \n </html> ");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}