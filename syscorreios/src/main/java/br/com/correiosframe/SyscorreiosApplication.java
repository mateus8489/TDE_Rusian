package br.com.correiosframe;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.xml.namespace.QName;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente;
import br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteService;
import br.com.correios.bsb.sigep.master.bean.cliente.SQLException_Exception;
import br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException;

@SpringBootApplication
public class SyscorreiosApplication {
	private static final QName SERVICE_NAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/",
			"AtendeClienteService");

	private SyscorreiosApplication() {

	}
	public static void main(String args[]) throws java.lang.Exception {
    	System.out.println("ASDASD");
        URL wsdlURL = AtendeClienteService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        AtendeClienteService ss = new AtendeClienteService(wsdlURL, SERVICE_NAME);
        AtendeCliente port = ss.getAtendeClientePort();

        {
        System.out.println("Invoking consultaCEP...");
        Scanner sc = new Scanner(System.in);
        String cep = sc.nextLine();
        java.lang.String _consultaCEP_cep = cep;
        try {
            br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP _consultaCEP__return = port.consultaCEP(_consultaCEP_cep);
            System.out.println("consultaCEP.result=" + _consultaCEP__return.getEnd()+","+_consultaCEP__return.getBairro()+" "+ _consultaCEP__return.getCidade()+","+_consultaCEP__return.getUf()+".");
        } catch (SQLException_Exception e) {
            System.out.println("Expected exception: SQLException has occurred.");
            System.out.println(e.toString());
        } catch (SigepClienteException e) {
            System.out.println("Expected exception: SigepClienteException has occurred.");
            System.out.println(e.toString());
        }
        }
        System.exit(0);
    }


	
	}
	
	
	


