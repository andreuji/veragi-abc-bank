package br.com.accesstage.veragi.platform.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url="${veragi.veragi-banco-abc.url}", name = "veragi-banco-abc", contextId = "veragi-banco-abc-client")
public class WebhookBancoABCClient {
}
