//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.10.12 às 08:43:58 PM BRT 
//


package com.linecode.jcep.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de bloquearObjeto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="bloquearObjeto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroEtiqueta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idPlp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tipoBloqueio" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}tipoBloqueio" minOccurs="0"/&gt;
 *         &lt;element name="acao" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}acao" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bloquearObjeto", propOrder = {
    "numeroEtiqueta",
    "idPlp",
    "tipoBloqueio",
    "acao",
    "usuario",
    "senha"
})
public class BloquearObjeto {

    protected String numeroEtiqueta;
    protected Long idPlp;
    @XmlSchemaType(name = "string")
    protected TipoBloqueio tipoBloqueio;
    @XmlSchemaType(name = "string")
    protected Acao acao;
    protected String usuario;
    protected String senha;

    /**
     * Obtém o valor da propriedade numeroEtiqueta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroEtiqueta() {
        return numeroEtiqueta;
    }

    /**
     * Define o valor da propriedade numeroEtiqueta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroEtiqueta(String value) {
        this.numeroEtiqueta = value;
    }

    /**
     * Obtém o valor da propriedade idPlp.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPlp() {
        return idPlp;
    }

    /**
     * Define o valor da propriedade idPlp.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPlp(Long value) {
        this.idPlp = value;
    }

    /**
     * Obtém o valor da propriedade tipoBloqueio.
     * 
     * @return
     *     possible object is
     *     {@link TipoBloqueio }
     *     
     */
    public TipoBloqueio getTipoBloqueio() {
        return tipoBloqueio;
    }

    /**
     * Define o valor da propriedade tipoBloqueio.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoBloqueio }
     *     
     */
    public void setTipoBloqueio(TipoBloqueio value) {
        this.tipoBloqueio = value;
    }

    /**
     * Obtém o valor da propriedade acao.
     * 
     * @return
     *     possible object is
     *     {@link Acao }
     *     
     */
    public Acao getAcao() {
        return acao;
    }

    /**
     * Define o valor da propriedade acao.
     * 
     * @param value
     *     allowed object is
     *     {@link Acao }
     *     
     */
    public void setAcao(Acao value) {
        this.acao = value;
    }

    /**
     * Obtém o valor da propriedade usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define o valor da propriedade usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtém o valor da propriedade senha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define o valor da propriedade senha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

}
