server {
	server_name owpk.ru;

        listen 80;

        location / {
                proxy_set_header Host $host;
                proxy_set_header X-Real-IP $remote_addr;
                proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
                proxy_set_header X-Forwarded-Proto $scheme;

                client_max_body_size 0;
                add_header Strict-Transport-Security "max-age=31536000; includeSubDomains : preload";
                add_header Referrer-Policy "same-origin";
                proxy_pass http://10.8.0.6:8080;
    }


    listen [::]:443 ssl ipv6only=on; # managed by Certbot
    listen 443 ssl; # managed by Certbot
    ssl_certificate /etc/letsencrypt/live/owpk.ru/fullchain.pem; # managed by Certbot
    ssl_certificate_key /etc/letsencrypt/live/owpk.ru/privkey.pem; # managed by Certbot
    include /etc/letsencrypt/options-ssl-nginx.conf; # managed by Certbot
    ssl_dhparam /etc/letsencrypt/ssl-dhparams.pem; # managed by Certbot

}
server {
	if ($host = owpk.ru) {
	   return 301 https://$host$request_url;
	}

	server_name owpk.ru;
	
	listen 80;
	return 404;
}
