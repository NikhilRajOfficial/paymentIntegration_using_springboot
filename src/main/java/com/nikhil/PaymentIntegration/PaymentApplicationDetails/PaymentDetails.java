package com.nikhil.PaymentIntegration.PaymentApplicationDetails;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@ConfigurationProperties("paytm.payment.sandbox")
public class PaymentDetails {

    private String merchantId;
	
	private String merchantKey;
	
	private String channelId;
	
	private String website;
	
	private String industryTypeId;
	
	private String paytmUrl;
	
	private Map<String, String> details;

    public PaymentDetails() {}

    
    
    public PaymentDetails(String merchantId, String merchantKey, String channelId, String website,
			String industryTypeId, String paytmUrl, Map<String, String> details) {
		super();
		this.merchantId = merchantId;
		this.merchantKey = merchantKey;
		this.channelId = channelId;
		this.website = website;
		this.industryTypeId = industryTypeId;
		this.paytmUrl = paytmUrl;
		this.details = details;
	}

}
