//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.10.12 às 09:43:54 AM BRT 
//


package com.linecode.jcep.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dimensaoTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dimensaoTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="altura" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}medidaTO" minOccurs="0"/&gt;
 *         &lt;element name="comprimento" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}medidaTO" minOccurs="0"/&gt;
 *         &lt;element name="diametro" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}medidaTO" minOccurs="0"/&gt;
 *         &lt;element name="largura" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}medidaTO" minOccurs="0"/&gt;
 *         &lt;element name="peso" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}medidaTO" minOccurs="0"/&gt;
 *         &lt;element name="soma" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}medidaTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dimensaoTO", propOrder = {
    "altura",
    "comprimento",
    "diametro",
    "largura",
    "peso",
    "soma"
})
public class DimensaoTO {

    protected MedidaTO altura;
    protected MedidaTO comprimento;
    protected MedidaTO diametro;
    protected MedidaTO largura;
    protected MedidaTO peso;
    protected MedidaTO soma;

    /**
     * Obtém o valor da propriedade altura.
     * 
     * @return
     *     possible object is
     *     {@link MedidaTO }
     *     
     */
    public MedidaTO getAltura() {
        return altura;
    }

    /**
     * Define o valor da propriedade altura.
     * 
     * @param value
     *     allowed object is
     *     {@link MedidaTO }
     *     
     */
    public void setAltura(MedidaTO value) {
        this.altura = value;
    }

    /**
     * Obtém o valor da propriedade comprimento.
     * 
     * @return
     *     possible object is
     *     {@link MedidaTO }
     *     
     */
    public MedidaTO getComprimento() {
        return comprimento;
    }

    /**
     * Define o valor da propriedade comprimento.
     * 
     * @param value
     *     allowed object is
     *     {@link MedidaTO }
     *     
     */
    public void setComprimento(MedidaTO value) {
        this.comprimento = value;
    }

    /**
     * Obtém o valor da propriedade diametro.
     * 
     * @return
     *     possible object is
     *     {@link MedidaTO }
     *     
     */
    public MedidaTO getDiametro() {
        return diametro;
    }

    /**
     * Define o valor da propriedade diametro.
     * 
     * @param value
     *     allowed object is
     *     {@link MedidaTO }
     *     
     */
    public void setDiametro(MedidaTO value) {
        this.diametro = value;
    }

    /**
     * Obtém o valor da propriedade largura.
     * 
     * @return
     *     possible object is
     *     {@link MedidaTO }
     *     
     */
    public MedidaTO getLargura() {
        return largura;
    }

    /**
     * Define o valor da propriedade largura.
     * 
     * @param value
     *     allowed object is
     *     {@link MedidaTO }
     *     
     */
    public void setLargura(MedidaTO value) {
        this.largura = value;
    }

    /**
     * Obtém o valor da propriedade peso.
     * 
     * @return
     *     possible object is
     *     {@link MedidaTO }
     *     
     */
    public MedidaTO getPeso() {
        return peso;
    }

    /**
     * Define o valor da propriedade peso.
     * 
     * @param value
     *     allowed object is
     *     {@link MedidaTO }
     *     
     */
    public void setPeso(MedidaTO value) {
        this.peso = value;
    }

    /**
     * Obtém o valor da propriedade soma.
     * 
     * @return
     *     possible object is
     *     {@link MedidaTO }
     *     
     */
    public MedidaTO getSoma() {
        return soma;
    }

    /**
     * Define o valor da propriedade soma.
     * 
     * @param value
     *     allowed object is
     *     {@link MedidaTO }
     *     
     */
    public void setSoma(MedidaTO value) {
        this.soma = value;
    }

}
