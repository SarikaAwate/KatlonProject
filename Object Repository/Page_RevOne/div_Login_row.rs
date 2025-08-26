<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Login_row</name>
   <tag></tag>
   <elementGuidId>b22e4914-a766-4c31-81de-633d71efc763</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='lpx-wrapper']/div[2]/div[2]/div/div</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>div.row</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorCollection>
      <entry>
         <key>SMART_LOCATOR</key>
         <value>.row</value>
      </entry>
   </smartLocatorCollection>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
      <webElementGuid>fa5f55ea-532e-4d0b-a02a-1f26cc28b965</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>row</value>
      <webElementGuid>f24d91b8-653e-4e8e-84a1-4ff2f0b64379</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value> 
							
								
								



								
    
    
        
            
                
            
          
            
                
                
                
                
                
                    Email  
                    
                    
                
                
                    Password
                    
                        
                        
                            
                        
                    
                    
                
                
                    
                        
                        Remember me
                    
                    
                    
                        Forgot password?
                    
                
                
                    Login
                
            
        

    




    #AbpPageAlerts {
        position: absolute;
        margin: auto;
        left: 0;
        right: 0;
        top: 4px;
        bottom: 0;
        font-size: small;
    }
    [role=&quot;alert&quot;] {
        z-index: 10;    
    }

    .input-group > .form-control:focus {
        z-index: 0;
    }




    fetch('https://ipapi.co/json/')
        .then(res => res.json())
        .then(data => {
            document.getElementById('ClientIp').value = data.ip;
        });

    document.getElementById('togglePassword').addEventListener('click', function () {
        const passwordInput = document.getElementById('passwordInput');
        const eyeIcon = document.getElementById('eyeIcon');
        const isPassword = passwordInput.type === 'password';

        passwordInput.type = isPassword ? 'text' : 'password';
        eyeIcon.classList.toggle('fa-eye-slash');
        eyeIcon.classList.toggle('fa-eye');
    });



						
								
							
						</value>
      <webElementGuid>32de463e-5a84-4978-8807-2070e498e959</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;lpx-wrapper&quot;)/div[@class=&quot;lpx-content-container m-0&quot;]/div[@class=&quot;lpx-content&quot;]/div[@class=&quot;container&quot;]/div[@class=&quot;row&quot;]</value>
      <webElementGuid>d5b2cb87-efee-447a-a306-1a3f8e21757c</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='lpx-wrapper']/div[2]/div[2]/div/div</value>
      <webElementGuid>9a220efa-9129-4ee8-9e44-8e1115ba23d6</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Login'])[2]/following::div[3]</value>
      <webElementGuid>798f3348-c6f1-4db5-901d-985bb6bc6057</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Español / ES'])[2]/following::div[3]</value>
      <webElementGuid>4dec29db-17ff-48e8-8e8d-171b250a5832</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[2]/div[2]/div/div</value>
      <webElementGuid>6c10e562-2900-4482-b8f2-53a809c7d973</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[(text() = concat(&quot; 
							
								
								



								
    
    
        
            
                
            
          
            
                
                
                
                
                
                    Email  
                    
                    
                
                
                    Password
                    
                        
                        
                            
                        
                    
                    
                
                
                    
                        
                        Remember me
                    
                    
                    
                        Forgot password?
                    
                
                
                    Login
                
            
        

    




    #AbpPageAlerts {
        position: absolute;
        margin: auto;
        left: 0;
        right: 0;
        top: 4px;
        bottom: 0;
        font-size: small;
    }
    [role=&quot;alert&quot;] {
        z-index: 10;    
    }

    .input-group > .form-control:focus {
        z-index: 0;
    }




    fetch(&quot; , &quot;'&quot; , &quot;https://ipapi.co/json/&quot; , &quot;'&quot; , &quot;)
        .then(res => res.json())
        .then(data => {
            document.getElementById(&quot; , &quot;'&quot; , &quot;ClientIp&quot; , &quot;'&quot; , &quot;).value = data.ip;
        });

    document.getElementById(&quot; , &quot;'&quot; , &quot;togglePassword&quot; , &quot;'&quot; , &quot;).addEventListener(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, function () {
        const passwordInput = document.getElementById(&quot; , &quot;'&quot; , &quot;passwordInput&quot; , &quot;'&quot; , &quot;);
        const eyeIcon = document.getElementById(&quot; , &quot;'&quot; , &quot;eyeIcon&quot; , &quot;'&quot; , &quot;);
        const isPassword = passwordInput.type === &quot; , &quot;'&quot; , &quot;password&quot; , &quot;'&quot; , &quot;;

        passwordInput.type = isPassword ? &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot; : &quot; , &quot;'&quot; , &quot;password&quot; , &quot;'&quot; , &quot;;
        eyeIcon.classList.toggle(&quot; , &quot;'&quot; , &quot;fa-eye-slash&quot; , &quot;'&quot; , &quot;);
        eyeIcon.classList.toggle(&quot; , &quot;'&quot; , &quot;fa-eye&quot; , &quot;'&quot; , &quot;);
    });



						
								
							
						&quot;) or . = concat(&quot; 
							
								
								



								
    
    
        
            
                
            
          
            
                
                
                
                
                
                    Email  
                    
                    
                
                
                    Password
                    
                        
                        
                            
                        
                    
                    
                
                
                    
                        
                        Remember me
                    
                    
                    
                        Forgot password?
                    
                
                
                    Login
                
            
        

    




    #AbpPageAlerts {
        position: absolute;
        margin: auto;
        left: 0;
        right: 0;
        top: 4px;
        bottom: 0;
        font-size: small;
    }
    [role=&quot;alert&quot;] {
        z-index: 10;    
    }

    .input-group > .form-control:focus {
        z-index: 0;
    }




    fetch(&quot; , &quot;'&quot; , &quot;https://ipapi.co/json/&quot; , &quot;'&quot; , &quot;)
        .then(res => res.json())
        .then(data => {
            document.getElementById(&quot; , &quot;'&quot; , &quot;ClientIp&quot; , &quot;'&quot; , &quot;).value = data.ip;
        });

    document.getElementById(&quot; , &quot;'&quot; , &quot;togglePassword&quot; , &quot;'&quot; , &quot;).addEventListener(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, function () {
        const passwordInput = document.getElementById(&quot; , &quot;'&quot; , &quot;passwordInput&quot; , &quot;'&quot; , &quot;);
        const eyeIcon = document.getElementById(&quot; , &quot;'&quot; , &quot;eyeIcon&quot; , &quot;'&quot; , &quot;);
        const isPassword = passwordInput.type === &quot; , &quot;'&quot; , &quot;password&quot; , &quot;'&quot; , &quot;;

        passwordInput.type = isPassword ? &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot; : &quot; , &quot;'&quot; , &quot;password&quot; , &quot;'&quot; , &quot;;
        eyeIcon.classList.toggle(&quot; , &quot;'&quot; , &quot;fa-eye-slash&quot; , &quot;'&quot; , &quot;);
        eyeIcon.classList.toggle(&quot; , &quot;'&quot; , &quot;fa-eye&quot; , &quot;'&quot; , &quot;);
    });



						
								
							
						&quot;))]</value>
      <webElementGuid>c0ff22ef-2b24-466d-bba2-713c8c7a622c</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
