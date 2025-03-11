a
<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 600 500">
  <!-- Background -->
  <rect width="600" height="500" fill="white" />
  
  <!-- Title -->
  <text x="300" y="30" font-family="Arial" font-size="18" font-weight="bold" text-anchor="middle">Self-Healing System Architecture</text>
  
  <!-- Layer 1: Monitoring -->
  <rect x="150" y="80" width="300" height="70" rx="10" fill="#e6f2ff" stroke="#0066cc" stroke-width="2" />
  <text x="300" y="110" font-family="Arial" font-size="14" font-weight="bold" text-anchor="middle">Monitoring Layer</text>
  <text x="300" y="130" font-family="Arial" font-size="10" text-anchor="middle">Detect failures across all integration points</text>
  
  <!-- Integration points on left -->
  <rect x="50" y="70" width="60" height="30" rx="5" fill="#f2f2f2" stroke="#666" stroke-width="1" />
  <text x="80" y="90" font-family="Arial" font-size="10" text-anchor="middle">Database</text>
  
  <rect x="50" y="110" width="60" height="30" rx="5" fill="#f2f2f2" stroke="#666" stroke-width="1" />
  <text x="80" y="130" font-family="Arial" font-size="10" text-anchor="middle">API</text>
  
  <rect x="50" y="150" width="60" height="30" rx="5" fill="#f2f2f2" stroke="#666" stroke-width="1" />
  <text x="80" y="170" font-family="Arial" font-size="10" text-anchor="middle">Kafka/MQ</text>
  
  <!-- Connecting arrows from systems to monitoring -->
  <line x1="110" y1="85" x2="150" y2="100" stroke="#666" stroke-width="1" stroke-dasharray="4,2" />
  <line x1="110" y1="125" x2="150" y2="115" stroke="#666" stroke-width="1" stroke-dasharray="4,2" />
  <line x1="110" y1="165" x2="150" y2="130" stroke="#666" stroke-width="1" stroke-dasharray="4,2" />
  
  <!-- Layer 2: Classification -->
  <rect x="150" y="170" width="300" height="70" rx="10" fill="#fff2e6" stroke="#ff8c00" stroke-width="2" />
  <text x="300" y="200" font-family="Arial" font-size="14" font-weight="bold" text-anchor="middle">Classification Engine</text>
  <text x="300" y="220" font-family="Arial" font-size="10" text-anchor="middle">Categorize failures by type and severity</text>
  
  <!-- Arrow from Layer 1 to 2 -->
  <line x1="300" y1="150" x2="300" y2="170" stroke="#0066cc" stroke-width="2" />
  <polygon points="300,170 295,160 305,160" fill="#0066cc" />
  
  <!-- Layer 3: Recovery -->
  <rect x="150" y="260" width="300" height="70" rx="10" fill="#e6ffcc" stroke="#66cc00" stroke-width="2" />
  <text x="300" y="290" font-family="Arial" font-size="14" font-weight="bold" text-anchor="middle">Recovery Workflows</text>
  <text x="300" y="310" font-family="Arial" font-size="10" text-anchor="middle">Automated procedures for each failure type</text>
  
  <!-- Arrow from Layer 2 to 3 -->
  <line x1="300" y1="240" x2="300" y2="260" stroke="#ff8c00" stroke-width="2" />
  <polygon points="300,260 295,250 305,250" fill="#ff8c00" />
  
  <!-- Layer 4: Reporting -->
  <rect x="150" y="350" width="300" height="70" rx="10" fill="#f2e6ff" stroke="#9933cc" stroke-width="2" />
  <text x="300" y="380" font-family="Arial" font-size="14" font-weight="bold" text-anchor="middle">Reporting Dashboard</text>
  <text x="300" y="400" font-family="Arial" font-size="10" text-anchor="middle">Track recovery success rates and patterns</text>
  
  <!-- Arrow from Layer 3 to 4 -->
  <line x1="300" y1="330" x2="300" y2="350" stroke="#66cc00" stroke-width="2" />
  <polygon points="300,350 295,340 305,340" fill="#66cc00" />
  
  <!-- Existing Systems integration on right -->
  <rect x="490" y="150" width="80" height="50" rx="5" fill="#f2f2f2" stroke="#666" stroke-width="1" />
  <text x="530" y="175" font-family="Arial" font-size="10" text-anchor="middle">Existing Alerting</text>
  <text x="530" y="190" font-family="Arial" font-size="10" text-anchor="middle">System</text>
  
  <rect x="490" y="230" width="80" height="50" rx="5" fill="#f2f2f2" stroke="#666" stroke-width="1" />
  <text x="530" y="255" font-family="Arial" font-size="10" text-anchor="middle">Business</text>
  <text x="530" y="270" font-family="Arial" font-size="10" text-anchor="middle">Rules Engine</text>
  
  <rect x="490" y="310" width="80" height="50" rx="5" fill="#f2f2f2" stroke="#666" stroke-width="1" />
  <text x="530" y="335" font-family="Arial" font-size="10" text-anchor="middle">Admin</text>
  <text x="530" y="350" font-family="Arial" font-size="10" text-anchor="middle">Dashboard</text>
  
  <!-- Connecting arrows from layers to existing systems -->
  <line x1="450" y1="175" x2="490" y2="175" stroke="#666" stroke-width="1" stroke-dasharray="4,2" />
  <line x1="450" y1="255" x2="490" y2="255" stroke="#666" stroke-width="1" stroke-dasharray="4,2" />
  <line x1="450" y1="335" x2="490" y2="335" stroke="#666" stroke-width="1" stroke-dasharray="4,2" />
  
  <!-- Data flow labels -->
  <text x="250" y="160" font-family="Arial" font-size="8" text-anchor="middle" fill="#0066cc">Failure Events</text>
  <text x="250" y="250" font-family="Arial" font-size="8" text-anchor="middle" fill="#ff8c00">Categorized Issues</text>
  <text x="250" y="340" font-family="Arial" font-size="8" text-anchor="middle" fill="#66cc00">Recovery Actions</text>
  <text x="250" y="430" font-family="Arial" font-size="8" text-anchor="middle" fill="#9933cc">Performance Metrics</text>
  
  <!-- Legend -->
  <rect x="50" y="430" width="10" height="10" fill="#e6f2ff" stroke="#0066cc" stroke-width="1" />
  <text x="65" y="440" font-family="Arial" font-size="8" text-anchor="start">Monitoring</text>
  
  <rect x="130" y="430" width="10" height="10" fill="#fff2e6" stroke="#ff8c00" stroke-width="1" />
  <text x="145" y="440" font-family="Arial" font-size="8" text-anchor="start">Classification</text>
  
  <rect x="220" y="430" width="10" height="10" fill="#e6ffcc" stroke="#66cc00" stroke-width="1" />
  <text x="235" y="440" font-family="Arial" font-size="8" text-anchor="start">Recovery</text>
  
  <rect x="310" y="430" width="10" height="10" fill="#f2e6ff" stroke="#9933cc" stroke-width="1" />
  <text x="325" y="440" font-family="Arial" font-size="8" text-anchor="start">Reporting</text>
</svg>
b
<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 600 400">
  <!-- Background -->
  <rect width="600" height="400" fill="white" />
  
  <!-- Title -->
  <text x="300" y="30" font-family="Arial" font-size="18" font-weight="bold" text-anchor="middle">Before vs After Implementation Benefits</text>
  
  <!-- Chart axes -->
  <line x1="100" y1="350" x2="550" y2="350" stroke="#444" stroke-width="2" />
  <line x1="100" y1="350" x2="100" y2="70" stroke="#444" stroke-width="2" />
  
  <!-- Y-axis labels -->
  <text x="95" y="350" font-family="Arial" font-size="10" text-anchor="end">0%</text>
  <text x="95" y="290" font-family="Arial" font-size="10" text-anchor="end">25%</text>
  <text x="95" y="230" font-family="Arial" font-size="10" text-anchor="end">50%</text>
  <text x="95" y="170" font-family="Arial" font-size="10" text-anchor="end">75%</text>
  <text x="95" y="110" font-family="Arial" font-size="10" text-anchor="end">100%</text>
  
  <!-- Horizontal grid lines -->
  <line x1="100" y1="290" x2="550" y2="290" stroke="#ddd" stroke-width="1" stroke-dasharray="5,5" />
  <line x1="100" y1="230" x2="550" y2="230" stroke="#ddd" stroke-width="1" stroke-dasharray="5,5" />
  <line x1="100" y1="170" x2="550" y2="170" stroke="#ddd" stroke-width="1" stroke-dasharray="5,5" />
  <line x1="100" y1="110" x2="550" y2="110" stroke="#ddd" stroke-width="1" stroke-dasharray="5,5" />
  
  <!-- Bar groups with labels -->
  <!-- Recovery Time (less is better) -->
  <text x="160" y="370" font-family="Arial" font-size="12" text-anchor="middle">Recovery Time</text>
  <rect x="130" y="200" width="30" height="150" fill="#cc0000" opacity="0.7" />
  <rect x="160" y="300" width="30" height="50" fill="#0066cc" opacity="0.7" />
  <text x="145" y="195" font-family="Arial" font-size="10" text-anchor="middle" fill="#444">Before</text>
  <text x="175" y="295" font-family="Arial" font-size="10" text-anchor="middle" fill="#444">After</text>
  
  <!-- Manual Effort (less is better) -->
  <text x="260" y="370" font-family="Arial" font-size="12" text-anchor="middle">Manual Effort</text>
  <rect x="230" y="150" width="30" height="200" fill="#cc0000" opacity="0.7" />
  <rect x="260" y="330" width="30" height="20" fill="#0066cc" opacity="0.7" />
  <text x="245" y="145" font-family="Arial" font-size="10" text-anchor="middle" fill="#444">Before</text>
  <text x="275" y="325" font-family="Arial" font-size="10" text-anchor="middle" fill="#444">After</text>
  
  <!-- System Uptime (more is better) -->
  <text x="360" y="370" font-family="Arial" font-size="12" text-anchor="middle">System Uptime</text>
  <rect x="330" y="230" width="30" height="120" fill="#cc0000" opacity="0.7" />
  <rect x="360" y="130" width="30" height="220" fill="#0066cc" opacity="0.7" />
  <text x="345" y="225" font-family="Arial" font-size="10" text-anchor="middle" fill="#444">Before</text>
  <text x="375" y="125" font-family="Arial" font-size="10" text-anchor="middle" fill="#444">After</text>
  
  <!-- Operational Costs (less is better) -->
  <text x="460" y="370" font-family="Arial" font-size="12" text-anchor="middle">Operational Costs</text>
  <rect x="430" y="170" width="30" height="180" fill="#cc0000" opacity="0.7" />
  <rect x="460" y="280" width="30" height="70" fill="#0066cc" opacity="0.7" />
  <text x="445" y="165" font-family="Arial" font-size="10" text-anchor="middle" fill="#444">Before</text>
  <text x="475" y="275" font-family="Arial" font-size="10" text-anchor="middle" fill="#444">After</text>
  
  <!-- Legend -->
  <rect x="440" y="60" width="15" height="15" fill="#cc0000" opacity="0.7" />
  <text x="460" y="72" font-family="Arial" font-size="12" text-anchor="start">Before Implementation</text>
  <rect x="440" y="85" width="15" height="15" fill="#0066cc" opacity="0.7" />
  <text x="460" y="97" font-family="Arial" font-size="12" text-anchor="start">After Implementation</text>
</svg>
c
<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 500 500">
  <!-- Background -->
  <rect width="500" height="500" fill="white" />
  
  <!-- Center circle -->
  <circle cx="250" cy="250" r="80" fill="#e6f2ff" stroke="#0066cc" stroke-width="3" />
  <text x="250" y="240" font-family="Arial" font-size="16" font-weight="bold" text-anchor="middle">Watcher</text>
  <text x="250" y="260" font-family="Arial" font-size="16" font-weight="bold" text-anchor="middle">System</text>
  
  <!-- Outer circle with gradient -->
  <circle cx="250" cy="250" r="170" fill="none" stroke="#99ccff" stroke-width="5" opacity="0.3" />
  
  <!-- Process steps - positioned in a circle -->
  <!-- 1. Monitor -->
  <circle cx="250" cy="80" r="40" fill="#e6f2ff" stroke="#0066cc" stroke-width="2" />
  <text x="250" y="85" font-family="Arial" font-size="12" font-weight="bold" text-anchor="middle">Monitor</text>
  
  <!-- 2. Detect Failure -->
  <circle cx="420" cy="250" r="40" fill="#ffe6cc" stroke="#ff8c00" stroke-width="2" />
  <text x="420" y="245" font-family="Arial" font-size="12" font-weight="bold" text-anchor="middle">Detect</text>
  <text x="420" y="260" font-family="Arial" font-size="12" font-weight="bold" text-anchor="middle">Failure</text>
  
  <!-- 3. Classify Issue -->
  <circle cx="250" cy="420" r="40" fill="#e6ffcc" stroke="#66cc00" stroke-width="2" />
  <text x="250" y="415" font-family="Arial" font-size="12" font-weight="bold" text-anchor="middle">Classify</text>
  <text x="250" y="430" font-family="Arial" font-size="12" font-weight="bold" text-anchor="middle">Issue</text>
  
  <!-- 4. Apply Recovery -->
  <circle cx="80" cy="250" r="40" fill="#d9e6ff" stroke="#3366ff" stroke-width="2" />
  <text x="80" y="245" font-family="Arial" font-size="12" font-weight="bold" text-anchor="middle">Apply</text>
  <text x="80" y="260" font-family="Arial" font-size="12" font-weight="bold" text-anchor="middle">Recovery</text>
  
  <!-- Connecting arrows -->
  <!-- Arrow 1 to 2 -->
  <path d="M280,100 Q350,150 400,220" fill="none" stroke="#0066cc" stroke-width="2" />
  <polygon points="400,220 390,210 385,222" fill="#0066cc" />
  
  <!-- Arrow 2 to 3 -->
  <path d="M390,280 Q350,350 280,400" fill="none" stroke="#0066cc" stroke-width="2" />
  <polygon points="280,400 278,388 270,395" fill="#0066cc" />
  
  <!-- Arrow 3 to 4 -->
  <path d="M220,400 Q150,350 100,280" fill="none" stroke="#0066cc" stroke-width="2" />
  <polygon points="100,280 95,292 110,290" fill="#0066cc" />
  
  <!-- Arrow 4 to 1 -->
  <path d="M100,220 Q150,150 220,100" fill="none" stroke="#0066cc" stroke-width="2" />
  <polygon points="220,100 208,95 210,108" fill="#0066cc" />
  
  <!-- Title -->
  <text x="250" y="30" font-family="Arial" font-size="20" font-weight="bold" text-anchor="middle">Self-Healing System Process</text>
  <text x="250" y="470" font-family="Arial" font-size="14" text-anchor="middle" fill="#0066cc">Continuous Automated Recovery Cycle</text>
</svg>
e
<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 700 400">
  <!-- Background -->
  <rect width="700" height="400" fill="white" />
  
  <!-- Main spine -->
  <line x1="50" y1="200" x2="650" y2="200" stroke="#444" stroke-width="3" />
  
  <!-- Spine arrow -->
  <polygon points="650,200 630,190 630,210" fill="#444" />
  
  <!-- Main issue -->
  <rect x="600" y="175" width="90" height="50" rx="10" fill="#ffcccc" stroke="#cc0000" stroke-width="2" />
  <text x="645" y="195" font-family="Arial" font-size="12" font-weight="bold" text-anchor="middle">Application</text>
  <text x="645" y="210" font-family="Arial" font-size="12" font-weight="bold" text-anchor="middle">Failures</text>
  
  <!-- Top branches (1, 3, 5, 7) -->
  <line x1="100" y1="200" x2="100" y2="90" stroke="#666" stroke-width="2" />
  <line x1="250" y1="200" x2="250" y2="90" stroke="#666" stroke-width="2" />
  <line x1="400" y1="200" x2="400" y2="90" stroke="#666" stroke-width="2" />
  <line x1="550" y1="200" x2="550" y2="90" stroke="#666" stroke-width="2" />
  
  <!-- Bottom branches (2, 4, 6) -->
  <line x1="175" y1="200" x2="175" y2="310" stroke="#666" stroke-width="2" />
  <line x1="325" y1="200" x2="325" y2="310" stroke="#666" stroke-width="2" />
  <line x1="475" y1="200" x2="475" y2="310" stroke="#666" stroke-width="2" />
  
  <!-- Branch issue boxes -->
  <!-- 1. Dependent system maintenance -->
  <rect x="20" y="50" width="160" height="40" rx="5" fill="#e6f2ff" stroke="#0066cc" stroke-width="2" />
  <text x="100" y="70" font-family="Arial" font-size="10" text-anchor="middle">1. Dependent system maintenance</text>
  <text x="100" y="85" font-family="Arial" font-size="8" text-anchor="middle">(EWS causing API call failures)</text>
  
  <!-- 2. MongoDB/Oracle exceptions -->
  <rect x="95" y="310" width="160" height="30" rx="5" fill="#e6f2ff" stroke="#0066cc" stroke-width="2" />
  <text x="175" y="330" font-family="Arial" font-size="10" text-anchor="middle">2. MongoDB/Oracle exceptions</text>
  
  <!-- 3. Kafka connection exceptions -->
  <rect x="170" y="50" width="160" height="30" rx="5" fill="#e6f2ff" stroke="#0066cc" stroke-width="2" />
  <text x="250" y="70" font-family="Arial" font-size="10" text-anchor="middle">3. Kafka connection exceptions</text>
  
  <!-- 4. MQ connection exceptions -->
  <rect x="245" y="310" width="160" height="30" rx="5" fill="#e6f2ff" stroke="#0066cc" stroke-width="2" />
  <text x="325" y="330" font-family="Arial" font-size="10" text-anchor="middle">4. MQ connection exceptions</text>
  
  <!-- 5. Application errors -->
  <rect x="320" y="50" width="160" height="40" rx="5" fill="#e6f2ff" stroke="#0066cc" stroke-width="2" />
  <text x="400" y="70" font-family="Arial" font-size="10" text-anchor="middle">5. Application errors</text>
  <text x="400" y="85" font-family="Arial" font-size="8" text-anchor="middle">(due to bugs in the code)</text>
  
  <!-- 6. Missed SLA responses -->
  <rect x="395" y="310" width="160" height="40" rx="5" fill="#e6f2ff" stroke="#0066cc" stroke-width="2" />
  <text x="475" y="330" font-family="Arial" font-size="10" text-anchor="middle">6. Missed asynchronous responses</text>
  <text x="475" y="345" font-family="Arial" font-size="8" text-anchor="middle">(within SLA time)</text>
  
  <!-- 7. Frequently failing API -->
  <rect x="470" y="50" width="160" height="40" rx="5" fill="#e6f2ff" stroke="#0066cc" stroke-width="2" />
  <text x="550" y="70" font-family="Arial" font-size="10" text-anchor="middle">7. Frequently failing API</text>
  <text x="550" y="85" font-family="Arial" font-size="8" text-anchor="middle">(data sync slowness)</text>
  
  <!-- Title -->
  <text x="350" y="25" font-family="Arial" font-size="16" font-weight="bold" text-anchor="middle">Root Causes of Application Failures</text>
</svg>

f
<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 500 300">
  <!-- Background -->
  <rect width="500" height="300" fill="white" />
  
  <!-- Human icon -->
  <circle cx="250" cy="80" r="25" fill="#99ccff" stroke="#0066cc" stroke-width="2" />
  <path d="M250,105 L250,145 M235,125 L250,145 L265,125 M250,145 L250,185 M235,185 L265,185" 
        fill="none" stroke="#0066cc" stroke-width="3" stroke-linecap="round" />
  
  <!-- Database icon -->
  <ellipse cx="120" cy="200" rx="40" ry="10" fill="#e6f2ff" stroke="#0066cc" stroke-width="2" />
  <path d="M80,200 L80,230 Q80,240 120,240 Q160,240 160,230 L160,200" fill="none" stroke="#0066cc" stroke-width="2" />
  <path d="M80,215 Q80,225 120,225 Q160,225 160,215" fill="none" stroke="#0066cc" stroke-width="1" />
  
  <!-- API icon -->
  <rect x="230" y="200" width="40" height="40" rx="5" fill="#e6f2ff" stroke="#0066cc" stroke-width="2" />
  <text x="250" y="225" font-family="Arial" font-size="14" font-weight="bold" text-anchor="middle">API</text>
  
  <!-- Message Queue icon -->
  <rect x="350" y="190" width="50" height="10" rx="2" fill="#e6f2ff" stroke="#0066cc" stroke-width="2" />
  <rect x="350" y="205" width="50" height="10" rx="2" fill="#e6f2ff" stroke="#0066cc" stroke-width="2" />
  <rect x="350" y="220" width="50" height="10" rx="2" fill="#e6f2ff" stroke="#0066cc" stroke-width="2" />
  <rect x="350" y="235" width="50" height="10" rx="2" fill="#e6f2ff" stroke="#0066cc" stroke-width="2" />
  
  <!-- Connecting arrows -->
  <line x1="235" y1="150" x2="120" y2="190" stroke="#0066cc" stroke-width="2" stroke-dasharray="5,3" />
  <polygon points="120,190 132,187 126,178" fill="#0066cc" />
  
  <line x1="250" y1="150" x2="250" y2="195" stroke="#0066cc" stroke-width="2" stroke-dasharray="5,3" />
  <polygon points="250,195 255,185 245,185" fill="#0066cc" />
  
  <line x1="265" y1="150" x2="375" y2="185" stroke="#0066cc" stroke-width="2" stroke-dasharray="5,3" />
  <polygon points="375,185 365,180 367,190" fill="#0066cc" />
  
  <!-- Labels -->
  <text x="120" y="260" font-family="Arial" font-size="12" text-anchor="middle">Database Operations</text>
  <text x="250" y="260" font-family="Arial" font-size="12" text-anchor="middle">API Calls</text>
  <text x="375" y="260" font-family="Arial" font-size="12" text-anchor="middle">Message Queue</text>
  <text x="250" y="45" font-family="Arial" font-size="16" font-weight="bold" text-anchor="middle">Manual Business Activities</text>
  <text x="250" y="65" font-family="Arial" font-size="12" text-anchor="middle" fill="#0066cc">Human Intervention Required</text>
</svg>
e
<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 600 250">
  <!-- Background -->
  <rect width="600" height="250" fill="white" />
  
  <!-- Boxes -->
  <rect x="30" y="80" width="120" height="60" rx="10" fill="#ffcccc" stroke="#cc0000" stroke-width="2" />
  <rect x="190" y="80" width="120" height="60" rx="10" fill="#ffe6cc" stroke="#ff8c00" stroke-width="2" />
  <rect x="350" y="80" width="120" height="60" rx="10" fill="#e6f2ff" stroke="#0066cc" stroke-width="2" />
  <rect x="510" y="80" width="60" height="60" rx="30" fill="#ffcccc" stroke="#cc0000" stroke-width="2" />
  
  <!-- Connecting arrows -->
  <line x1="150" y1="110" x2="190" y2="110" stroke="#666666" stroke-width="2" />
  <polygon points="190,110 180,105 180,115" fill="#666666" />
  
  <line x1="310" y1="110" x2="350" y2="110" stroke="#666666" stroke-width="2" />
  <polygon points="350,110 340,105 340,115" fill="#666666" />
  
  <line x1="470" y1="110" x2="510" y2="110" stroke="#666666" stroke-width="2" />
  <polygon points="510,110 500,105 500,115" fill="#666666" />
  
  <!-- Box text -->
  <text x="90" y="115" font-family="Arial" font-size="12" text-anchor="middle">Application Failure</text>
  <text x="250" y="105" font-family="Arial" font-size="12" text-anchor="middle">Manual</text>
  <text x="250" y="120" font-family="Arial" font-size="12" text-anchor="middle">Investigation</text>
  <text x="410" y="105" font-family="Arial" font-size="12" text-anchor="middle">Developer</text>
  <text x="410" y="120" font-family="Arial" font-size="12" text-anchor="middle">Consultation</text>
  
  <!-- Warning symbol -->
  <text x="540" y="122" font-family="Arial" font-size="30" text-anchor="middle" fill="#cc0000">✗</text>
  
  <!-- Inefficiency label -->
  <rect x="450" y="180" width="120" height="30" rx="15" fill="#ffeeee" stroke="#cc0000" stroke-width="1" />
  <text x="510" y="200" font-family="Arial" font-size="12" text-anchor="middle" fill="#cc0000">Manual Inefficiency</text>
  
  <!-- Arrow from X to label -->
  <path d="M540,140 Q540,160 510,180" fill="none" stroke="#cc0000" stroke-width="1" stroke-dasharray="4,4" />
  <polygon points="510,180 518,174 515,184" fill="#cc0000" />
  
  <!-- Title -->
  <text x="300" y="40" font-family="Arial" font-size="16" font-weight="bold" text-anchor="middle">Current Manual Process Workflow</text>
</svg>
  g
  <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 700 400">
  <!-- Background -->
  <rect width="700" height="400" fill="white" />
  
  <!-- Title -->
  <text x="350" y="35" font-family="Arial" font-size="20" font-weight="bold" text-anchor="middle">OPS Team Manual Business Activities</text>
  
  <!-- Ops Team Group Box -->
  <rect x="50" y="60" width="600" height="120" rx="10" fill="#f2f9ff" stroke="#0066cc" stroke-width="2" stroke-dasharray="5,3" />
  <text x="100" y="80" font-family="Arial" font-size="14" font-weight="bold" fill="#0066cc" text-anchor="start">PASS Operations Team</text>
  
  <!-- Multiple team members -->
  <!-- Team Member 1 -->
  <circle cx="120" cy="120" r="20" fill="#99ccff" stroke="#0066cc" stroke-width="2" />
  <path d="M120,140 L120,170 M110,155 L120,170 L130,155 M120,170 L120,190 M110,190 L130,190" 
        fill="none" stroke="#0066cc" stroke-width="2" stroke-linecap="round" />
  
  <!-- Team Member 2 -->
  <circle cx="180" cy="120" r="20" fill="#99ccff" stroke="#0066cc" stroke-width="2" />
  <path d="M180,140 L180,170 M170,155 L180,170 L190,155 M180,170 L180,190 M170,190 L190,190" 
        fill="none" stroke="#0066cc" stroke-width="2" stroke-linecap="round" />
  
  <!-- Team Member 3 -->
  <circle cx="240" cy="120" r="20" fill="#99ccff" stroke="#0066cc" stroke-width="2" />
  <path d="M240,140 L240,170 M230,155 L240,170 L250,155 M240,170 L240,190 M230,190 L250,190" 
        fill="none" stroke="#0066cc" stroke-width="2" stroke-linecap="round" />
  
  <!-- Stress/Overwork Indicators -->
  <text x="115" y="110" font-family="Arial" font-size="15" text-anchor="middle">😓</text>
  <text x="175" y="110" font-family="Arial" font-size="15" text-anchor="middle">😩</text>
  <text x="235" y="110" font-family="Arial" font-size="15" text-anchor="middle">😥</text>
  
  <!-- Manual Tools -->
  <rect x="290" y="100" width="80" height="40" rx="5" fill="#ffffcc" stroke="#cc9900" stroke-width="2" />
  <text x="330" y="125" font-family="Arial" font-size="12" text-anchor="middle">Manual Tools</text>
  
  <!-- Computer/Terminal -->
  <rect x="400" y="90" width="60" height="50" rx="5" fill="#e6e6e6" stroke="#666" stroke-width="2" />
  <rect x="410" y="100" width="40" height="25" rx="2" fill="#ffffff" stroke="#666" stroke-width="1" />
  <rect x="420" y="130" width="20" height="5" rx="1" fill="#999" />
  
  <!-- Critical alert symbols -->
  <circle cx="480" cy="110" r="15" fill="#ffcccc" stroke="#cc0000" stroke-width="2" />
  <text x="480" y="115" font-family="Arial" font-size="16" font-weight="bold" text-anchor="middle">!</text>
  <circle cx="510" cy="110" r="15" fill="#ffcccc" stroke="#cc0000" stroke-width="2" />
  <text x="510" y="115" font-family="Arial" font-size="16" font-weight="bold" text-anchor="middle">!</text>
  <circle cx="540" cy="110" r="15" fill="#ffcccc" stroke="#cc0000" stroke-width="2" />
  <text x="540" y="115" font-family="Arial" font-size="16" font-weight="bold" text-anchor="middle">!</text>
  
  <!-- Clock/SLA indicator -->
  <circle cx="610" cy="110" r="25" fill="white" stroke="#cc0000" stroke-width="2" />
  <line x1="610" y1="110" x2="610" y2="95" stroke="#cc0000" stroke-width="2" />
  <line x1="610" y1="110" x2="625" y2="110" stroke="#cc0000" stroke-width="2" />
  <text x="610" y="140" font-family="Arial" font-size="10" text-anchor="middle" fill="#cc0000">SLA Countdown</text>
  
  <!-- Manual Activities Section -->
  <rect x="50" y="220" width="600" height="160" rx="10" fill="#f9f9f9" stroke="#666" stroke-width="1" />
  <text x="350" y="240" font-family="Arial" font-size="16" font-weight="bold" text-anchor="middle">Manual Business Activities</text>
  
  <!-- Database Operations Box -->
  <rect x="80" y="260" width="160" height="100" rx="5" fill="#e6f2ff" stroke="#0066cc" stroke-width="2" />
  <text x="160" y="280" font-family="Arial" font-size="14" font-weight="bold" text-anchor="middle">Database Operations</text>
  
  <!-- Database icon -->
  <ellipse cx="110" cy="310" rx="25" ry="7" fill="#cce0ff" stroke="#0066cc" stroke-width="1" />
  <path d="M85,310 L85,330 Q85,337 110,337 Q135,337 135,330 L135,310" fill="none" stroke="#0066cc" stroke-width="1" />
  <path d="M85,320 Q85,327 110,327 Q135,327 135,320" fill="none" stroke="#0066cc" stroke-width="1" />
  
  <!-- DB Operation text -->
  <text x="160" y="305" font-family="Arial" font-size="10" text-anchor="start">• Modify entries</text>
  <text x="160" y="320" font-family="Arial" font-size="10" text-anchor="start">• Update records</text>
  <text x="160" y="335" font-family="Arial" font-size="10" text-anchor="start">• Delete failed notifications</text>
  
  <!-- API Calls Box -->
  <rect x="270" y="260" width="160" height="100" rx="5" fill="#fff2e6" stroke="#ff8c00" stroke-width="2" />
  <text x="350" y="280" font-family="Arial" font-size="14" font-weight="bold" text-anchor="middle">API Calls</text>
  
  <!-- API icon -->
  <rect x="290" y="300" width="30" height="30" rx="3" fill="#ffe6cc" stroke="#ff8c00" stroke-width="1" />
  <text x="305" y="320" font-family="Arial" font-size="10" font-weight="bold" text-anchor="middle">API</text>
  
  <!-- API Operation text -->
  <text x="350" y="305" font-family="Arial" font-size="10" text-anchor="start">• Invoke API calls</text>
  <text x="350" y="320" font-family="Arial" font-size="10" text-anchor="start">• Retry failed requests</text>
  <text x="350" y="335" font-family="Arial" font-size="10" text-anchor="start">• Monitor responses</text>
  
  <!-- Message Queue Box -->
  <rect x="460" y="260" width="160" height="100" rx="5" fill="#e6ffe6" stroke="#00cc00" stroke-width="2" />
  <text x="540" y="280" font-family="Arial" font-size="14" font-weight="bold" text-anchor="middle">Message Queue</text>
  
  <!-- Queue icon -->
  <rect x="480" y="295" width="40" height="8" rx="2" fill="#ccffcc" stroke="#00cc00" stroke-width="1" />
  <rect x="480" y="307" width="40" height="8" rx="2" fill="#ccffcc" stroke="#00cc00" stroke-width="1" />
  <rect x="480" y="319" width="40" height="8" rx="2" fill="#ccffcc" stroke="#00cc00" stroke-width="1" />
  <rect x="480" y="331" width="40" height="8" rx="2" fill="#ccffcc" stroke="#00cc00" stroke-width="1" />
  
  <!-- Queue Operation text -->
  <text x="540" y="305" font-family="Arial" font-size="10" text-anchor="start">• Send events to Kafka</text>
  <text x="540" y="320" font-family="Arial" font-size="10" text-anchor="start">• Manage MQ connections</text>
  <text x="540" y="335" font-family="Arial" font-size="10" text-anchor="start">• Process queued messages</text>
  
  <!-- Connecting dotted lines from team to activities -->
  <path d="M120,190 C120,220 100,240 160,260" fill="none" stroke="#0066cc" stroke-width="1.5" stroke-dasharray="4,2" />
  <path d="M180,190 C180,220 200,240 350,260" fill="none" stroke="#ff8c00" stroke-width="1.5" stroke-dasharray="4,2" />
  <path d="M240,190 C240,230 300,240 540,260" fill="none" stroke="#00cc00" stroke-width="1.5" stroke-dasharray="4,2" />
</svg>
mk
  <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 750 550">
  <!-- Background -->
  <rect width="750" height="550" fill="white" />
  
  <!-- Title -->
  <text x="375" y="30" font-family="Arial" font-size="20" font-weight="bold" text-anchor="middle">Self-Healing System Architecture</text>
  
  <!-- Systems/Applications Section -->
  <rect x="30" y="60" width="180" height="180" rx="10" fill="#f9f9f9" stroke="#666" stroke-width="1" />
  <text x="120" y="80" font-family="Arial" font-size="14" font-weight="bold" text-anchor="middle">Application Environment</text>
  
  <!-- Database -->
  <rect x="60" y="100" width="120" height="30" rx="5" fill="#e6f2ff" stroke="#0066cc" stroke-width="1" />
  <text x="120" y="120" font-family="Arial" font-size="12" text-anchor="middle">Database</text>
  
  <!-- API -->
  <rect x="60" y="150" width="120" height="30" rx="5" fill="#e6f2ff" stroke="#0066cc" stroke-width="1" />
  <text x="120" y="170" font-family="Arial" font-size="12" text-anchor="middle">API Services</text>
  
  <!-- Message Queue -->
  <rect x="60" y="200" width="120" height="30" rx="5" fill="#e6f2ff" stroke="#0066cc" stroke-width="1" />
  <text x="120" y="220" font-family="Arial" font-size="12" text-anchor="middle">Kafka/MQ</text>
  
  <!-- Failure Indicators -->
  <circle cx="190" cy="115" r="10" fill="#ffcccc" stroke="#cc0000" stroke-width="1" />
  <text x="190" y="119" font-family="Arial" font-size="14" font-weight="bold" text-anchor="middle" fill="#cc0000">!</text>
  
  <circle cx="190" cy="165" r="10" fill="#ffcccc" stroke="#cc0000" stroke-width="1" />
  <text x="190" y="169" font-family="Arial" font-size="14" font-weight="bold" text-anchor="middle" fill="#cc0000">!</text>
  
  <circle cx="190" cy="215" r="10" fill="#ffcccc" stroke="#cc0000" stroke-width="1" />
  <text x="190" y="219" font-family="Arial" font-size="14" font-weight="bold" text-anchor="middle" fill="#cc0000">!</text>
  
  <!-- Self-Healing System Box -->
  <rect x="250" y="60" width="470" height="430" rx="15" fill="#f5faff" stroke="#0066cc" stroke-width="2" />
  <text x="485" y="80" font-family="Arial" font-size="16" font-weight="bold" text-anchor="middle" fill="#0066cc">WATCHER: Self-Healing System</text>
  
  <!-- Layer 1: Monitoring -->
  <rect x="290" y="100" width="390" height="80" rx="10" fill="#e6f2ff" stroke="#0066cc" stroke-width="2" />
  <text x="335" y="125" font-family="Arial" font-size="14" font-weight="bold" text-anchor="middle">Monitoring Layer</text>
  <text x="335" y="145" font-family="Arial" font-size="10" text-anchor="middle">Detect failures across all</text>
  <text x="335" y="160" font-family="Arial" font-size="10" text-anchor="middle">integration points</text>
  
  <!-- Monitoring icons -->
  <circle cx="420" cy="140" r="25" fill="#cce0ff" stroke="#0066cc" stroke-width="1" />
  <path d="M400,140 L440,140 M420,120 L420,160" stroke="#0066cc" stroke-width="1" />
  <path d="M405,125 Q420,110 435,125" stroke="#0066cc" stroke-width="1" />
  <path d="M405,155 Q420,170 435,155" stroke="#0066cc" stroke-width="1" />
  
  <!-- Monitoring visualization -->
  <path d="M470,130 L480,125 L490,145 L500,120 L510,135 L520,125 L530,140 L540,130 L550,140 L560,125 L570,130 L580,115 L590,140 L600,125 L610,130 L620,120" fill="none" stroke="#0066cc" stroke-width="1" />
  <path d="M470,150 L480,155 L490,145 L500,160 L510,145 L520,155 L530,140 L540,150 L550,140 L560,155 L570,150 L580,165 L590,140 L600,155 L610,150 L620,160" fill="none" stroke="#cc0000" stroke-width="1" stroke-dasharray="2,1" />
  <text x="550" y="175" font-family="Arial" font-size="8" text-anchor="middle">Anomaly Detection</text>
  
  <!-- Layer 2: Classification -->
  <rect x="290" y="200" width="390" height="80" rx="10" fill="#fff2e6" stroke="#ff8c00" stroke-width="2" />
  <text x="335" y="225" font-family="Arial" font-size="14" font-weight="bold" text-anchor="middle">Classification Engine</text>
  <text x="335" y="245" font-family="Arial" font-size="10" text-anchor="middle">Categorize failures by</text>
  <text x="335" y="260" font-family="Arial" font-size="10" text-anchor="middle">type and severity</text>
  
  <!-- Classification visual: categories -->
  <rect x="440" y="215" width="50" height="20" rx="3" fill="#ffcccc" stroke="#cc0000" stroke-width="1" />
  <text x="465" y="229" font-family="Arial" font-size="8" text-anchor="middle">Critical</text>
  
  <rect x="500" y="215" width="50" height="20" rx="3" fill="#ffe6cc" stroke="#ff8c00" stroke-width="1" />
  <text x="525" y="229" font-family="Arial" font-size="8" text-anchor="middle">High</text>
  
  <rect x="560" y="215" width="50" height="20" rx="3" fill="#ffffcc" stroke="#cccc00" stroke-width="1" />
  <text x="585" y="229" font-family="Arial" font-size="8" text-anchor="middle">Medium</text>
  
  <rect x="620" y="215" width="50" height="20" rx="3" fill="#e6ffcc" stroke="#66cc00" stroke-width="1" />
  <text x="645" y="229" font-family="Arial" font-size="8" text-anchor="middle">Low</text>
  
  <!-- Failure types -->
  <rect x="420" y="245" width="80" height="15" rx="2" fill="#f2f2f2" stroke="#666" stroke-width="1" />
  <text x="460" y="256" font-family="Arial" font-size="7" text-anchor="middle">DB Connection</text>
  
  <rect x="510" y="245" width="80" height="15" rx="2" fill="#f2f2f2" stroke="#666" stroke-width="1" />
  <text x="550" y="256" font-family="Arial" font-size="7" text-anchor="middle">API Timeout</text>
  
  <rect x="600" y="245" width="80" height="15" rx="2" fill="#f2f2f2" stroke="#666" stroke-width="1" />
  <text x="640" y="256" font-family="Arial" font-size="7" text-anchor="middle">Kafka Connection</text>
  
  <rect x="460" y="265" width="80" height="15" rx="2" fill="#f2f2f2" stroke="#666" stroke-width="1" />
  <text x="500" y="276" font-family="Arial" font-size="7" text-anchor="middle">MQ Exception</text>
  
  <rect x="550" y="265" width="80" height="15" rx="2" fill="#f2f2f2" stroke="#666" stroke-width="1" />
  <text x="590" y="276" font-family="Arial" font-size="7" text-anchor="middle">SLA Breach</text>
  
  <!-- Layer 3: Recovery -->
  <rect x="290" y="300" width="390" height="100" rx="10" fill="#e6ffcc" stroke="#66cc00" stroke-width="2" />
  <text x="335" y="325" font-family="Arial" font-size="14" font-weight="bold" text-anchor="middle">Recovery Workflows</text>
  <text x="335" y="345" font-family="Arial" font-size="10" text-anchor="middle">Automated procedures</text>
  <text x="335" y="360" font-family="Arial" font-size="10" text-anchor="middle">for each failure type</text>
  
  <!-- Recovery visual: action types -->
  <g transform="translate(420, 315)">
    <circle cx="0" cy="0" r="20" fill="#ccffcc" stroke="#00cc00" stroke-width="1" />
    <text x="0" y="4" font-family="Arial" font-size="8" text-anchor="middle">Reconnect</text>
    <path d="M-8,-10 C-15,0 -15,10 -8,10 C0,10 0,-10 8,-10 C15,-10 15,0 8,10" fill="none" stroke="#00cc00" stroke-width="1" />
  </g>
  
  <g transform="translate(490, 315)">
    <circle cx="0" cy="0" r="20" fill="#ccffcc" stroke="#00cc00" stroke-width="1" />
    <text x="0" y="4" font-family="Arial" font-size="8" text-anchor="middle">Retry</text>
    <polygon points="-10,0 0,-10 10,0 0,10" fill="none" stroke="#00cc00" stroke-width="1" />
  </g>
  
  <g transform="translate(560, 315)">
    <circle cx="0" cy="0" r="20" fill="#ccffcc" stroke="#00cc00" stroke-width="1" />
    <text x="0" y="4" font-family="Arial" font-size="8" text-anchor="middle">Re-route</text>
    <path d="M-10,-5 L0,-5 L0,-10 L10,0 L0,10 L0,5 L-10,5 Z" fill="none" stroke="#00cc00" stroke-width="1" />
  </g>
  
  <g transform="translate(630, 315)">
    <circle cx="0" cy="0" r="20" fill="#ccffcc" stroke="#00cc00" stroke-width="1" />
    <text x="0" y="4" font-family="Arial" font-size="8" text-anchor="middle">Restart</text>
    <path d="M-5,-10 L5,-10 L5,-5 L10,-5 L0,5 L-10,-5 L-5,-5 Z" fill="none" stroke="#00cc00" stroke-width="1" />
  </g>
  
  <!-- Healing visualization with gears and arrows -->
  <rect x="410" y="350" width="250" height="40" rx="5" fill="white" stroke="#66cc00" stroke-width="1" />
  <text x="535" y="365" font-family="Arial" font-size="8" text-anchor="middle">Automated Healing Actions</text>
  <text x="460" y="380" font-family="Arial" font-size="7" text-anchor="middle" fill="#666">• Reset connections</text>
  <text x="535" y="380" font-family="Arial" font-size="7" text-anchor="middle" fill="#666">• Recreate API sessions</text>
  <text x="610" y="380" font-family="Arial" font-size="7" text-anchor="middle" fill="#666">• Reprocess failed messages</text>
  
  <!-- Layer 4: Reporting -->
  <rect x="290" y="420" width="390" height="60" rx="10" fill="#f2e6ff" stroke="#9933cc" stroke-width="2" />
  <text x="335" y="445" font-family="Arial" font-size="14" font-weight="bold" text-anchor="middle">Reporting Dashboard</text>
  <text x="335" y="465" font-family="Arial" font-size="10" text-anchor="middle">Track recovery success rates</text>
  
  <!-- Dashboard preview -->
  <rect x="400" y="430" width="270" height="40" rx="3" fill="white" stroke="#9933cc" stroke-width="1" />
  <path d="M410,450 L430,445 L450,455 L470,435 L490,460 L510,450 L530,440 L550,450 L570,445 L590,460 L610,440 L630,450 L650,445" fill="none" stroke="#66cc00" stroke-width="1" />
  <text x="535" y="465" font-family="Arial" font-size="8" text-anchor="middle">Recovery Success Rate: 97.5%</text>
  
  <!-- Arrows between layers -->
  <line x1="485" y1="180" x2="485" y2="200" stroke="#0066cc" stroke-width="2" />
  <polygon points="485,200 480,190 490,190" fill="#0066cc" />
  
  <line x1="485" y1="280" x2="485" y2="300" stroke="#ff8c00" stroke-width="2" />
  <polygon points="485,300 480,290 490,290" fill="#ff8c00" />
  
  <line x1="485" y1="400" x2="485" y2="420" stroke="#66cc00" stroke-width="2" />
  <polygon points="485,420 480,410 490,410" fill="#66cc00" />
  
  <!-- Failure detection flow -->
  <path d="M210,115 C230,115 240,130 260,130" fill="none" stroke="#cc0000" stroke-width="2" stroke-dasharray="4,2" />
  <path d="M210,165 C230,165 240,140 260,140" fill="none" stroke="#cc0000" stroke-width="2" stroke-dasharray="4,2" />
  <path d="M210,215 C230,215 240,150 260,150" fill="none" stroke="#cc0000" stroke-width="2" stroke-dasharray="4,2" />
  
  <!-- Healing flow back to systems -->
  <path d="M290,350 C250,350 240,115 210,115" fill="none" stroke="#00cc00" stroke-width="2" stroke-dasharray="4,2" />
  <polygon points="210,115 220,110 220,120" fill="#00cc00" />
  
  <path d="M290,350 C260,350 250,165 210,165" fill="none" stroke="#00cc00" stroke-width="2" stroke-dasharray="4,2" />
  <polygon points="210,165 220,160 220,170" fill="#00cc00" />
  
  <path d="M290,350 C270,350 260,215 210,215" fill="none" stroke="#00cc00" stroke-width="2" stroke-dasharray="4,2" />
  <polygon points="210,215 220,210 220,220" fill="#00cc00" />
  
  <!-- Before/After Indicators -->
  <rect x="30" y="280" width="80" height="25" rx="5" fill="#ffcccc" stroke="#cc0000" stroke-width="1" />
  <text x="70" y="297" font-family="Arial" font-size="10" text-anchor="middle">BEFORE</text>
  
  <rect x="130" y="280" width="80" height="25" rx="5" fill="#ccffcc" stroke="#00cc00" stroke-width="1" />
  <text x="170" y="297" font-family="Arial" font-size="10" text-anchor="middle">AFTER</text>
  
  <!-- Problem Scenario -->
  <g transform="translate(100, 335)">
    <rect x="-50" y="-25" width="100" height="90" rx="10" fill="#fff0f0" stroke="#cc0000" stroke-width="1" />
    <text x="0" y="-10" font-family="Arial" font-size="10" font-weight="bold" text-anchor="middle">Problems</text>
    <text x="0" y="10" font-family="Arial" font-size="8" text-anchor="middle">• Manual intervention</text>
    <text x="0" y="25" font-family="Arial" font-size="8" text-anchor="middle">• SLA breaches</text>
    <text x="0" y="40" font-family="Arial" font-size="8" text-anchor="middle">• System downtime</text>
    <text x="0" y="55" font-family="Arial" font-size="8" text-anchor="middle">• Resource intensive</text>
  </g>
  
  <!-- Solution Benefits -->
  <g transform="translate(100, 440)">
    <rect x="-50" y="-25" width="100" height="90" rx="10" fill="#f0fff0" stroke="#00cc00" stroke-width="1" />
    <text x="0" y="-10" font-family="Arial" font-size="10" font-weight="bold" text-anchor="middle">Benefits</text>
    <text x="0" y="10" font-family="Arial" font-size="8" text-anchor="middle">• Automated recovery</text>
    <text x="0" y="25" font-family="Arial" font-size="8" text-anchor="middle">• Reduced downtime</text>
    <text x="0" y="40" font-family="Arial" font-size="8" text-anchor="middle">• SLA compliance</text>
    <text x="0" y="55" font-family="Arial" font-size="8" text-anchor="middle">• Resource optimization</text>
  </g>
  
  <!-- Legend -->
  <rect x="30" y="530" width="10" height="10" fill="#e6f2ff" stroke="#0066cc" stroke-width="1" />
  <text x="45" y="538" font-family="Arial" font-size="8" text-anchor="start">Monitoring</text>
  
  <rect x="120" y="530" width="10" height="10" fill="#fff2e6" stroke="#ff8c00" stroke-width="1" />
  <text x="135" y="538" font-family="Arial" font-size="8" text-anchor="start">Classification</text>
  
  <rect x="210" y="530" width="10" height="10" fill="#e6ffcc" stroke="#66cc00" stroke-width="1" />
  <text x="225" y="538" font-family="Arial" font-size="8" text-anchor="start">Recovery</text>
  
  <rect x="300" y="530" width="10" height="10" fill="#f2e6ff" stroke="#9933cc" stroke-width="1" />
  <text x="315" y="538" font-family="Arial" font-size="8" text-anchor="start">Reporting</text>
  
  <line x1="380" y1="530" x2="400" y2="530" stroke="#cc0000" stroke-width="2" stroke-dasharray="4,2" />
  <text x="420" y="538" font-family="Arial" font-size="8" text-anchor="start">Failure Detection</text>
  
  <line x1="500" y1="530" x2="520" y2="530" stroke="#00cc00" stroke-width="2" stroke-dasharray="4,2" />
  <text x="540" y="538" font-family="Arial" font-size="8" text-anchor="start">Healing Flow</text>
</svg>
  
