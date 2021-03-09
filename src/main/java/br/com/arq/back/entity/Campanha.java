package br.com.arq.back.entity;

 
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
 

@Entity
@Table(name = "CAMPANHA")
public class Campanha {

	@Id
	@Column(name = "COD_CAMPANHA")

	private Integer campaignCode;

	@Column(name = "NOM_CAMPANHA")
	private String campaignName;
 

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario", insertable = true, updatable = false)
	private Usuario inclusionUser;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DAT_INCLUSAO", insertable = true, updatable = false)
	private Date inclusionDate;

 	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DAT_MODIFICACAO")
	private Date modificationDate;

	@Column(name = "QTD_LIMITE_OFERTA")
	private BigDecimal offerLimitCount;

	@Column(name = "COD_CAMPANHA_MKT")
	private Integer marketingCampaignCode;

	  @Column(name="status_campanha")
	 private String status;
	 

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PRODUTO", referencedColumnName = "ID_PRODUTO", insertable = true)
	private Produto produto;

	@Column(name = "VAL_MOD_PRODUTO", precision = 18, scale = 2)
	private BigDecimal productModeValue;

	@Column(name = "VAL_MAX_INVESTIMENTO", precision = 18, scale = 2)
	private BigDecimal maximumInvestmentValue;
 

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DAT_INICIO")
	private Date initialDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DAT_TERMINO")
	private Date endDate;

	public Campanha(Integer campaignCode, String campaignName, Usuario inclusionUser, Date inclusionDate,
			Date modificationDate, BigDecimal offerLimitCount, Integer marketingCampaignCode, String status,
			Produto product, BigDecimal productModeValue, BigDecimal maximumInvestmentValue, Date initialDate,
			Date endDate) {
		super();
		this.campaignCode = campaignCode;
		this.campaignName = campaignName;
		this.inclusionUser = inclusionUser;
		this.inclusionDate = inclusionDate;
		this.modificationDate = modificationDate;
		this.offerLimitCount = offerLimitCount;
		this.marketingCampaignCode = marketingCampaignCode;
		this.status = status;
		this.produto = product;
		this.productModeValue = productModeValue;
		this.maximumInvestmentValue = maximumInvestmentValue;
		this.initialDate = initialDate;
		this.endDate = endDate;
	}
	
	public Campanha() {
	}

	public Integer getCampaignCode() {
		return campaignCode;
	}

	public void setCampaignCode(Integer campaignCode) {
		this.campaignCode = campaignCode;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public Usuario getInclusionUser() {
		return inclusionUser;
	}

	public void setInclusionUser(Usuario inclusionUser) {
		this.inclusionUser = inclusionUser;
	}

	public Date getInclusionDate() {
		return inclusionDate;
	}

	public void setInclusionDate(Date inclusionDate) {
		this.inclusionDate = inclusionDate;
	}

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

	public BigDecimal getOfferLimitCount() {
		return offerLimitCount;
	}

	public void setOfferLimitCount(BigDecimal offerLimitCount) {
		this.offerLimitCount = offerLimitCount;
	}

	public Integer getMarketingCampaignCode() {
		return marketingCampaignCode;
	}

	public void setMarketingCampaignCode(Integer marketingCampaignCode) {
		this.marketingCampaignCode = marketingCampaignCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

 

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public BigDecimal getProductModeValue() {
		return productModeValue;
	}

	public void setProductModeValue(BigDecimal productModeValue) {
		this.productModeValue = productModeValue;
	}

	public BigDecimal getMaximumInvestmentValue() {
		return maximumInvestmentValue;
	}

	public void setMaximumInvestmentValue(BigDecimal maximumInvestmentValue) {
		this.maximumInvestmentValue = maximumInvestmentValue;
	}

	public Date getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
 
	
	
}
