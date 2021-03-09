package br.com.arq.back.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PROMOCAO")
public class Promocao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer saleCode;

	@Column(name = "TITU_PROMO")
	private String saleTitle;

	@Column(name = "DESC_PROMO")
	private String saleDescription;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_INIC")
	private Date startDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_FINA")
	private Date endDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_CADASTRO")
	private Date registerDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_CANC")
	private Date cancelDate;

	@Column(name = "IDT_CAMP")
	private Integer campaignCode;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PRODUTO", referencedColumnName = "ID_PRODUTO", insertable = true)
	private Produto produto;

	public Promocao() {
	 
	}

	public Promocao(Integer saleCode, String saleTitle, String saleDescription, Date startDate, Date endDate,
			Date registerDate, Date cancelDate, Integer campaignCode, Produto produtos) {
		super();
		this.saleCode = saleCode;
		this.saleTitle = saleTitle;
		this.saleDescription = saleDescription;
		this.startDate = startDate;
		this.endDate = endDate;
		this.registerDate = registerDate;
		this.cancelDate = cancelDate;
		this.campaignCode = campaignCode;
		this.produto = produtos;
	}

	@Override
	public String toString() {
		return "Sale [saleCode=" + saleCode + ", saleTitle=" + saleTitle + ", saleDescription=" + saleDescription
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", registerDate=" + registerDate
				+ ", cancelDate=" + cancelDate + ", campaignCode=" + campaignCode + "]";
	}

	public Integer getSaleCode() {
		return saleCode;
	}

	public void setSaleCode(Integer saleCode) {
		this.saleCode = saleCode;
	}

	public String getSaleTitle() {
		return saleTitle;
	}

	public void setSaleTitle(String saleTitle) {
		this.saleTitle = saleTitle;
	}

	public String getSaleDescription() {
		return saleDescription;
	}

	public void setSaleDescription(String saleDescription) {
		this.saleDescription = saleDescription;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public Date getCancelDate() {
		return cancelDate;
	}

	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}

	public Integer getCampaignCode() {
		return campaignCode;
	}

	public void setCampaignCode(Integer campaignCode) {
		this.campaignCode = campaignCode;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

 

}
