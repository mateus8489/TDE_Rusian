
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java de cancelarPedidoScolResponse complex type.
 * 
 * &lt;p&gt;O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="cancelarPedidoScolResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="return" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}retornoCancelamento" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelarPedidoScolResponse", propOrder = {
    "_return"
})
public class CancelarPedidoScolResponse {

    @XmlElement(name = "return")
    protected RetornoCancelamento _return;

    /**
     * Obtém o valor da propriedade return.
     * 
     * @return
     *     possible object is
     *     {@link RetornoCancelamento }
     *     
     */
    public RetornoCancelamento getReturn() {
        return _return;
    }

    /**
     * Define o valor da propriedade return.
     * 
     * @param value
     *     allowed object is
     *     {@link RetornoCancelamento }
     *     
     */
    public void setReturn(RetornoCancelamento value) {
        this._return = value;
    }

}
