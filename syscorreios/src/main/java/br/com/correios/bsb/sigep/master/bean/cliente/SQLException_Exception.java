
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.4.3
 * 2021-10-14T19:57:33.718-03:00
 * Generated source version: 3.4.3
 */

@WebFault(name = "SQLException", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/")
public class SQLException_Exception extends java.lang.Exception {

    private br.com.correios.bsb.sigep.master.bean.cliente.SQLException faultInfo;

    public SQLException_Exception() {
        super();
    }

    public SQLException_Exception(String message) {
        super(message);
    }

    public SQLException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public SQLException_Exception(String message, br.com.correios.bsb.sigep.master.bean.cliente.SQLException sqlException) {
        super(message);
        this.faultInfo = sqlException;
    }

    public SQLException_Exception(String message, br.com.correios.bsb.sigep.master.bean.cliente.SQLException sqlException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = sqlException;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.SQLException getFaultInfo() {
        return this.faultInfo;
    }
}
